package com.hspedu.static_;

public class ChildGame {
    public static void main(String[] args) {
        Child.count = 10;
        Child child1 = new Child("jack");
        child1.playGame();
        Child child2 = new Child("mary");
        child2.playGame();
        Child child3 = new Child("john");
        child3.playGame();
        Child child4 = new Child("jane");
        child4.playGame();
        System.out.println("共有" + Child.count + "个小孩加入了游戏" );


    }
}

class Child{
//    类变量或者叫静态变量
    public static int count;
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public  void playGame(){
        System.out.println(name + "加入了游戏。。。");
        count++;//普通方法能访问静态变量和静态方法
        this.name = "1";
    }

//    静态方法中只能访问静态变量或静态方法，不用初始化对象就能调用
    public static void playGame1(){
//        System.out.println(name + "加入了游戏。。。");
    }
}
