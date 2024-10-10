package com.hspedu.extends_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
//        从子类依次往上查找父类看是否有这个属性（需考虑访问修饰符）,期间一旦遇到在某类查中找失败（如遇到private修饰的属性），
//        不会在往下继续查找，直接报错。
//        初始化对象时，即使是私有属性也会在对象中创建
        System.out.println(son.name);
//        System.out.println(son.age);无法访问

    }
}
class GrandPa{
    String name = "大头爷爷";
    String hobby = "旅游";
    int age = 70;//将会被Father类age挡住

}
class Father extends GrandPa{
    String name = "大头爸爸";
    private int age = 39;
}
class Son extends Father{
    String name = "大头儿子";
}