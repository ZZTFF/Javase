package com.hspedu.interface_;
//定义接口类,是为了统一规范
public interface AInterface {
//普通属性
    public int n1 = 10;

    public void hi();

    //    普通方法需要default
    default public void ok(){}


    public static void say(){}
}
