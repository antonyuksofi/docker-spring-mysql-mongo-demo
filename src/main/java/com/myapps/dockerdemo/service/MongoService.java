package com.myapps.dockerdemo.service;

import com.myapps.dockerdemo.model.MySqlExampleObject;
import com.myapps.dockerdemo.repository.MongoTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class MongoService implements DbService {

    @Autowired
    MongoTestRepository mongoRepository;

    public void create(String name) {
        Map map = Collections.singletonMap("name", name);

        mongoRepository.insert(map);
    }

    public String get(String name) {
        return mongoRepository.get("name", name);
    }

    @Override
    public String getAll() {
        return mongoRepository.getAll();
    }
}
