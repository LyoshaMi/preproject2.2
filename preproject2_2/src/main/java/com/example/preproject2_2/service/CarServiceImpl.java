package com.example.preproject2_2.service;

import com.example.preproject2_2.Dao.CarDao;
import com.example.preproject2_2.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCountCars(int count) {
        return carDao.getCountCars(count);
    }
}
