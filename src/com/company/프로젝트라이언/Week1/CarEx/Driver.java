package com.company.프로젝트라이언.Week1.CarEx;

public class Driver {
    public String name;
    public int license;

    public Driver() {
    }

    public Driver(String name, int license) {
        this.name = name;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", license=" + license +
                '}';
    }
}
