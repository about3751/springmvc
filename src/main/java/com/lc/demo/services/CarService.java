package com.lc.demo.services;

import com.lc.demo.entities.Car;

import java.util.List;

/**
 * Created by leich on 2017/3/27.
 */
public interface CarService {

    int addCar(Car car);

    Car selectCarById(String id);

    List<Car> queryAll();

}
