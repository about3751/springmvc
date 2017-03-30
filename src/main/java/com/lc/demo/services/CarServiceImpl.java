package com.lc.demo.services;

import com.lc.demo.dao.CarMapper;
import com.lc.demo.entities.Car;
import com.lc.demo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by leich on 2017/3/27.
 */
@Service(value = "carService")
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    public int addCar(Car car) throws RuntimeException {
        Car car1 = new Car();
        car1.setCarName("正确");
        car1.setCarType("正确");
        int resultID = carMapper.insertCar(car1);
        if (resultID <= 0) {
            throw new RuntimeException("ERROR!!!!!!!!!!!!!!!!!!!!!!!");
        }
        return resultID;
    }

    public Car selectCarById(String id) throws RuntimeException {
        Car car = carMapper.selectCarByID(id);
        if (true) {
            throw new RuntimeException("Error !!!!!!!!!!!!!!!!!!!!");
        }
        return car;
    }

    public List<Car> queryAll() {
        return carMapper.selectAllCar();
    }
}
