package com.hspedu.poly.objploy;
//对象的多态(重点)

//一个对象的编译类型和运行类型可以不一样
//编译类型在定义对象时已经确定了，不能改变
//运行类型是可以改变的
//编译类型看定义时=的左边，运行类型看=右边

//Animal animal = new Dog();则animal编译类型是Animal，运行类型是Dog
//再次执行animal = new Cat();则编译类型不变，运行类型变为Cat
public class ployObject {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.cry();//运行代码执行到这行时，animal运行类型是Dog，所以输出小狗在叫
        animal = new Cat();
        animal.cry();

    }
}


