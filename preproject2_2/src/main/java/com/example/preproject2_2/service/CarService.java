package com.example.preproject2_2.service;

import com.example.preproject2_2.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CarService {

    List<Car> getCountCars(int count);
}
