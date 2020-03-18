package com.kxikw.develop.gable.controller;

import com.kxikw.develop.gable.model.History;
import com.kxikw.develop.gable.repository.HistoryRepository;
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
public class HistoryController {

    @Autowired
    HistoryRepository historyRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/History")
    public Iterable<History> contact() {
        return historyRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/History")
    public History save(@RequestBody History product) {
        historyRepository.save(product);

        return product;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/History/{id}")
    public Optional<History> show(@PathVariable String id) {
        return historyRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/History/{id}")
    public History update(@PathVariable String id, @RequestBody History product) {
        Optional<History> optcontact = historyRepository.findById(id);
        History c = optcontact.get();
        if (product.getStore_name() != null)
            c.setStore_name(product.getStore_name());
        if (product.getBranch() != null)
            c.setBranch(product.getBranch());
        if (product.getType() != null)
            c.setType(product.getType());
        if (product.getQty() != null)
            c.setQty(product.getQty());
            historyRepository.save(c);
        return c;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/History/{id}")
    public String delete(@PathVariable String id) {
        Optional<History> optcontact = historyRepository.findById(id);
        History contact = optcontact.get();
        historyRepository.delete(contact);

        return "";
    }
}