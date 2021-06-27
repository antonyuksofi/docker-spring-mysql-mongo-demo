package com.myapps.dockerdemo.controller.db;

import com.myapps.dockerdemo.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mongo")
public class MongoController implements DbController {
    @Autowired
    DbService mongoService;

    @Override
    public void create(@RequestParam String name) {
        mongoService.create(name);
    }

    @Override
    public String get(@RequestParam String name) {
        return mongoService.get(name);
    }

    @Override
    public String getAll() {
        return mongoService.getAll();
    }
}
