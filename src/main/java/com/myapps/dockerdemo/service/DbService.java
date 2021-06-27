package com.myapps.dockerdemo.service;

public interface DbService {

    void create(String name);

    String get(String name);

    String getAll();
}
