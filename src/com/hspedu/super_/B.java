package com.hspedu.super_;

public class B extends A{

    //        访问父类的构造器，仅能在构造器中使用
    public B() {
        super();
    }

//    访问父类的属性，除了private属性
        public void hi(){
            System.out.println(super.n1);
            System.out.println(super.n2);
            System.out.println(super.n3);
        }

//        访问父类的方法，除了private方法
        public void say(){
            super.m1();
            super.m2();
            super.m3();
        }

        public void sum(){
            System.out.println("B类的sum方法");
//            我想在这里调用A类cal方法，下面有三种方式
            //找cal方法时，先找本类，可以调用则调用
            //没有就依次找父类，如果遇到private的cal方法，即使再往上查找父类有public的cal方法，
            //也不会在继续查找，会报错。
            //对于查找属性，也是同样下面三种
            cal();
            this.cal();//等价于cal();
            super.cal();//直接查找父类，并依次往上查找
        }

//  尝试在子类B类中定义private cal方法，在父类A类中也有public cal方法，
    //这里相当于子类降低了父类中同名方法的权限。这不符合原则，原来这里是重写
//    private void cal(){}

//    与上面同理定义一个与父类同名的属性，则不存在上面的问题，
    private int age = 100;
    public void sayAge(){
        System.out.println(this.age);
    }

}
