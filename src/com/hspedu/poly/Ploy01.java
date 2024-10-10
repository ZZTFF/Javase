package com.hspedu.poly;


public class Ploy01 {
    public static void main(String[] args) {
        Master master = new Master("jack");
        Dog dog = new Dog("小黄");
        Bone bone = new Bone("大棒骨");
        master.feed(dog, bone);

        Cat cat = new Cat("狸花猫");
        Fish fish = new Fish("黄花鱼");
        master.feed(cat, fish);
    }
}


