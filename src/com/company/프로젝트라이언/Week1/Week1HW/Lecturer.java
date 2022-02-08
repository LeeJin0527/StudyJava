package com.company.프로젝트라이언.Week1.Week1HW;

public class Lecturer extends AbstractPerson {

    private String name;
    private int age;
    private String status = "깅사 ";


    public Lecturer(String name, int age) {
        super(name, age);
        this.status = status;

    }

    @Override
    public void speak() {
        super.speak();
    }
}
