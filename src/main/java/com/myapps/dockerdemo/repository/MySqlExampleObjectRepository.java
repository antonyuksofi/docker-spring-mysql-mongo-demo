package com.myapps.dockerdemo.repository;

import com.myapps.dockerdemo.model.MySqlExampleObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlExampleObjectRepository extends JpaRepository<MySqlExampleObject, Integer> {

    MySqlExampleObject findByName(String name);
}
