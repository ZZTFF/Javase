package com.hspedu.Object;

public class ToString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("jack", 18);
        System.out.println(monster.toString());
    }

}
class Monster{
    private String name;
    private int age;

    public Monster(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}