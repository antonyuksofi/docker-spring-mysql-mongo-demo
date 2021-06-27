#!/usr/bin/env bash
mvn clean install
docker-compose build spring-app
docker-compose up