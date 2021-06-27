package com.myapps.dockerdemo.service;

import com.myapps.dockerdemo.model.MySqlExampleObject;
import com.myapps.dockerdemo.repository.MySqlExampleObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class MySqlService implements DbService {

    @Autowired
    MySqlExampleObjectRepository mySqlExampleObjectRepository;

    public void create(String name) {
        MySqlExampleObject mySqlExampleObject = new MySqlExampleObject();

        mySqlExampleObject.setName(name);

        mySqlExampleObjectRepository.save(mySqlExampleObject);
    }

    public String get(String name) {
        return Optional.ofNullable(mySqlExampleObjectRepository.findByName(name))
                .map(Object::toString)
                .orElse("no object found");
    }

    @Override
    public String getAll() {
        return Stream.of(mySqlExampleObjectRepository.findAll())
                .map(Object::toString)
                .reduce("", String::concat);
    }
}
