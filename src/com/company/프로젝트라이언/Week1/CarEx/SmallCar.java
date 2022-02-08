package com.company.프로젝트라이언.Week1.CarEx;



public class SmallCar extends AbstractCar implements CarInterface{

    private Driver driver;

    @Override
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void accelerate() {
        this.velocity += 5;
    }

    @Override
    public void brake() {
        this.velocity -= 5;
        super.brake();
    }

    @Override
    public String toString() {
        return "SmallCar{" +
                "driver=" + driver +
                '}';
    }
}