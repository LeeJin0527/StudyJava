package com.company.프로젝트라이언.Week1.Week1HW;

public abstract class AbstractPerson implements Person {
    protected String name;
    protected int age;
    protected String status;

    public AbstractPerson(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public void speak() {
        System.out.println("이름은 "+name+"이며 나이는 "+age+"이고 "+status+"입니다.");
    }

}
