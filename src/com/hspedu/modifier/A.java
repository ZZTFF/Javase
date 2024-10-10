package com.hspedu.modifier;


//总结：同包不同类，不能访问私有，不同包仅可访问public
public class A {
//    四个修饰符，可以来修饰属性，方法
//    只有默认和public可以修饰类
    public int n1 =  400;
    protected int n2 = 300;
    int n3 = 200;
    private int n4 = 100;
//    对于类中调用方法来访问，这是在类内部进行的，可以访问类中所有属性
    public void m1(){
        System.out.println("直接调用A中方法");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }


    protected void m2(){

    }
    void m3(){

    }
    private void m4(){

    }
    //同一类所有方法都可调用
    public void f(){
        m1();
        m2();
        m3();
        m4();
    }



}
