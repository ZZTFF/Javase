package com.hspedu.override_;
//方法覆盖，子类和父类（或更高父类）有相同方法名称，参数
//子类返回类型与父类返回类型相同或着是其返回类型的子类
//重写不能降低方法的访问权限，只能大于等于
public class Override01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
    }
}

