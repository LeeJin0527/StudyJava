package com.company.프로젝트라이언.Week1.Week1HW;

public abstract class AbstractPerson implements Person {
    protected String name;
    protected int age;
    protected String status;

    public AbstractPerson(String name, int age, String status) {
        this.name = name;
        this.age = age;
        this.status = status;

    }

    @Override
    public void speak() {
        System.out.println("이름은 "+name+"이며 나이는 "+age+"이고 "+status+"입니다!");
    }

    @Override
    public String toString() {
        return "AbstractPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                '}';
    }
}
