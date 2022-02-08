package com.company.프로젝트라이언.Week1.Week1HW;

public class Student extends AbstractPerson {
    private String name;
    private int age;
    private String status = "학생 ";

    public Student(String name, int age) {
        super(name, age);
        this.status = status;
    }

    @Override
    public void speak() {
        // 상태의 결과 값이 null 이 나옴
        super.speak();
    }
}
