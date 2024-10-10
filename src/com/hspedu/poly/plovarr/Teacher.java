package com.hspedu.poly.plovarr;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say(){
        return "Teacher " + super.say() + "salary:" + salary;
    }

    public String teaching(){
        return getName() + " is teaching java";
    }
}
