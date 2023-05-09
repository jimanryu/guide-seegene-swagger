#! /bin/bash

docker build -t pilota .

docker run --name pilota -p 8080:8080 -d pilota
