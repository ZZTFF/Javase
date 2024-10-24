package com.hspedu.override_;

public class Person {
    private String name;
    private int age;

    public Person(int age, String name) {
            setName(name);
            setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say() {
        return "I am " + name + " and I am " + age + " years old.";

    }
}
