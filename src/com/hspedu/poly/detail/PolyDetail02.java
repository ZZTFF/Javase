package com.hspedu.poly.detail;

public class PolyDetail02 {
    public static void main(String[] args) {
//       属性没有重写之说，属性的值看编译类型
        Base base = new Sub();
//        System.out.println(base.n1);
//        向上转型:仍然只能访问父类除私有以外的属性，且不是从子类开始看
//        而是直接看编译类型
        System.out.println(base.n2);
        System.out.println(base.n3);
        System.out.println(base.n4);

        //进行向下转型,此时用编译类型为Sub的sub对象，
        // 可访问Sub除了private的属性
        Sub sub = (Sub)base;
//        System.out.println(sub.n1);
        System.out.println(sub.n2);
        System.out.println(sub.n3);
        System.out.println(sub.n4);
        System.out.println(sub.n5);
    }
}

class Base{
    private int n1 = 100;
    int n2 = 200;
    protected int n3 = 300;
    public int n4 = 400;

}

class Sub extends Base{
    public int n5 = 900;

    private int n1 = 500;
    int n2 = 600;
    protected int n3 = 700;
    public int n4 = 800;
}
