package com.lc.demo.services.impl;

import com.lc.demo.dao.CarMapper;
import com.lc.demo.entities.Car;
import com.lc.demo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by leich on 2017/3/27.
 */
@Service(value = "carService")
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    public Car selectCarById(String id) {
        return carMapper.selectCarByID(id);
    }

    public List<Car> queryAll() {
        return carMapper.selectAllCar();
    }
}
