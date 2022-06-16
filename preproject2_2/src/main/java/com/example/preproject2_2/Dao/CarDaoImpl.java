package com.example.preproject2_2.Dao;


import com.example.preproject2_2.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("bmw", 100,100));
        carList.add(new Car("mc", 200,200));
        carList.add(new Car("mazda", 300,300));
        carList.add(new Car("toyouta", 400,400));
        carList.add(new Car("lada", 500,500));
        carList.add(new Car("lada", 500,500));
        carList.add(new Car("lada", 500,500));
        carList.add(new Car("lada", 500,500));
        carList.add(new Car("lada", 500,500));
        carList.add(new Car("lada", 500,500));
    }

    @Override
    public List<Car> getCountCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
