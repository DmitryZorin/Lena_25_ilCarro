package com.ilcarro.qa.model;

public class Car {
    private  String country;
    private  String address;
    private  String distance;
    private  String serialNumber;
    private  String brand;
    private  String model;
    private  String year;
    private  String engine;
    private  String fuelConsumption;
    private  String fuel;
    private  String transmission;
    private  String wd;
    private  String horsepower;
    private  String torque;
    private  String doors;
    private  String seats;
    private  String classs;
    private  String about;
    private  String feture;
    private  String price;

    public Car setCountry(String country) {
        this.country = country;
        return  this;
    }

    public Car setAddress(String address) {
        this.address = address;
        return  this;
    }

    public Car setDistance(String distance) {
        this.distance = distance;
        return  this;
    }

    public Car setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return  this;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return  this;
    }

    public Car setModel(String model) {
        this.model = model;
        return  this;
    }

    public Car setYear(String year) {
        this.year = year;
        return  this;
    }

    public Car setEngine(String engine) {
        this.engine = engine;
        return  this;
    }

    public Car setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return  this;
    }

    public Car setFuel(String fuel) {
        this.fuel = fuel;
        return  this;
    }

    public Car setTransmission(String transmission) {
        this.transmission = transmission;
        return  this;
    }

    public Car setWd(String wd) {
        this.wd = wd;
        return  this;
    }

    public Car setHorsepower(String horsepower) {
        this.horsepower = horsepower;
        return  this;
    }

    public Car setTorque(String torque) {
        this.torque = torque;
        return  this;
    }

    public Car setDoors(String doors) {
        this.doors = doors;
        return  this;
    }



    public Car setSeats(String seats) {
        this.seats = seats;
        return  this;
    }

    public Car setClasss(String classs) {
        this.classs = classs;
        return  this;
    }

    public Car setAbout(String about) {
        this.about = about;
        return  this;
    }

    public Car setFeature(String feture) {
        this.feture = feture;
        return  this;
    }

    public Car setPrice(String price) {
        this.price = price;
        return  this;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getDistance() {
        return distance;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public String getFuel() {
        return fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getWd() {
        return wd;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public String getTorque() {
        return torque;
    }

    public String getDoors() {
        return doors;
    }

    public String getSeats() {
        return seats;
    }

    public String getClasss() {
        return classs;
    }

    public String getAbout() {
        return about;
    }

    public String getFeture() {
        return feture;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
