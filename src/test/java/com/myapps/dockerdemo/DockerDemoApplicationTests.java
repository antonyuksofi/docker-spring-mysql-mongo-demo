package com.myapps.dockerdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

//@SpringBootTest
class DockerDemoApplicationTests {

//	@Test
//	void contextLoads() {
//	}

    @Test
    void myTest() {
        List<Integer> list = new ArrayList<>(3);
        Optional.of(list)
                .map(Objects::toString)
                .toString();
    }
}
