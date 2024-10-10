package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person("jack", 1000, 1000);
        System.out.println(person.info());
    }

}
class Person{
    public String name;//名字公开
    private int age;
    private double salary;
//这时候没有使用构造器，如果使用构造器初始化对象，会跳过定义的setName方法，因此将set方法写进构造器中

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }
        else{
            System.out.println("Invalid name,将会初始化为0");
            this.name = null;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120){
            this.age = age;
        }
        else{
            System.out.println("Invalid Age");
            this.age = 0;
        }
    }
//    写一个方法返回所有信息
    public String info(){
        return "信息为 name=" + this.name + ' ' + "age=" + this.age + ' ' + "salary=" + this.salary ;
    }
}
