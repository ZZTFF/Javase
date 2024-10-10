package com.hspedu.poly;

public class Master {
    private String masterName;

    public Master(String masterName) {
        setMasterName(masterName);
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

//    传统方法
//    主人给狗喂骨头
//    public void feed(Dog dog, Bone bone) {
//        System.out.println("主人" + masterName + "正在给" + dog.getName() + "喂食" + bone.getName());
//    }
//
////主人给猫喂鱼
//public void feed(Cat cat, Fish fish) {
//    System.out.println("主人" + masterName + "正在给" + cat.getName() + "喂食" + fish.getName());
//}
//由此，如果动物和食物都很多，则这个方法需要进行很多次重载，利用率也不高，不利于管理和维护
//    由此引出多态

//使用多态解决代码复用率低的问题
//    等价于Animal animal = dog;
//          Food food = bone;
//    父类的引用指向子类的对象，则可以使得仅仅定义一个父类对象即可接受不同的子类对象，并且使用子类的方法
    public void feed(Animal animal, Food food) {
        System.out.println("主人" + masterName + "正在给" + animal.getName() + "喂食" + food.getName());
    }
}

