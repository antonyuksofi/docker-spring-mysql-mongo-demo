package com.myapps.dockerdemo.controller.db;

import com.myapps.dockerdemo.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mysql")
public class MySqlController implements DbController {
    @Autowired
    DbService mySqlService;

    @Override
    public void create(@RequestParam String name) {
        mySqlService.create(name);
    }

    @Override
    public String get(@RequestParam String name) {
        return mySqlService.get(name);
    }

    @Override
    public String getAll() {
        return mySqlService.getAll();
    }
}
