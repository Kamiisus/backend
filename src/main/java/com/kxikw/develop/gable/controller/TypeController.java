package com.kxikw.develop.gable.controller;

import com.kxikw.develop.gable.model.TypeName;
import com.kxikw.develop.gable.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TypeController {

    @Autowired
    TypeRepository typeRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/type")
    public Iterable<TypeName> contact() {
        return typeRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/type/{id}")
    public Optional<TypeName> show(@PathVariable String type_id) {
        return typeRepository.findById(type_id);
    }
}