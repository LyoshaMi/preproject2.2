package com.example.preproject2_2.model;

public class Car {
    private String name;

    private int price;

    private int horsePower;

    public Car(String name, int price, int horsePower) {
        this.name = name;
        this.price = price;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
