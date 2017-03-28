package com.lc.demo.dao;

import com.lc.demo.entities.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leich on 2017/3/27.
 */
@Repository
public interface CarMapper {

    Car selectCarByID(String id);

    List<Car> selectAllCar();

}
