package com.hspedu.pkg;

import com.hspedu.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
//        对于不同包下的直接访问他类中属性，仅可访问public属性
        System.out.println(a.n1);

//        由于是访问方法，方法访问类中属性是在类中进行的，这里会输出A中全部属性
        a.m1();


//        由于是夸包访问方法，只能访问public方法
        a.m1();
//        a.m2();
//      a.m3();
//        a.m4();
    }
}
