package com.hspedu.extends_.improve;

public class Extends01 {
    public static void main(String[] args) {
        com.hspedu.extends_.improve.Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        com.hspedu.extends_.improve.Graduate graduate = new Graduate();
        graduate.name = "大明";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
