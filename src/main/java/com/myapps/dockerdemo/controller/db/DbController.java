package com.myapps.dockerdemo.controller.db;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public interface DbController {

    @PostMapping("/create")
    void create(String name);

    @GetMapping("/get")
    String get(String name);

    @GetMapping("/get/all")
    String getAll();
}
