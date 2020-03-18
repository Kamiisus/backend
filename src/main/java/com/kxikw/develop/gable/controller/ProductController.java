package com.kxikw.develop.gable.controller;

import com.kxikw.develop.gable.model.Product;
import com.kxikw.develop.gable.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/store")
    public Iterable<Product> contact() {
        return productRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/store")
    public Product save(@RequestBody Product product) {
        productRepository.save(product);

        return product;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/store/{id}")
    public Optional<Product> show(@PathVariable String id) {
        return productRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/store/{id}")
    public Product update(@PathVariable String id, @RequestBody Product product) {
        Optional<Product> optcontact = productRepository.findById(id);
        Product c = optcontact.get();
        if (product.getStore_name() != null)
            c.setStore_name(product.getStore_name());
        if (product.getBranch() != null)
            c.setBranch(product.getBranch());
        if (product.getType() != null)
            c.setType(product.getType());
        if (product.getQty() != null)
            c.setQty(product.getQty());
        if (product.getPrice() != null)
         c.setPrice(product.getPrice());
        productRepository.save(c);
        return c;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/store/{id}")
    public String delete(@PathVariable String id) {
        Optional<Product> optcontact = productRepository.findById(id);
        Product contact = optcontact.get();
        productRepository.delete(contact);

        return "";
    }
}