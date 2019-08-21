package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car = new Car("BMW", "X One", 2016);
        repository.save(car);

        car = new Car("Toyota", "RAV Four", 2018);
        repository.save(car);

        car = new Car("Jeep", "Compass", 2020);
        repository.save(car);
    }
}
