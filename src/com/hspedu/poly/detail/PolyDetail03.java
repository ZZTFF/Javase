package com.hspedu.poly.detail;

public class PolyDetail03 {
    public static void main(String[] args) {

        BB bb = new BB();//bb运行类型是BB
        AA aa = new BB();//aa运行类型是BB
//判断aa的运行类型是不是后面的类型或者是他的子类型
        System.out.println(aa instanceof BB);
        System.out.println(aa instanceof AA);

        String str = "123";
        System.out.println(str instanceof Object);//true

    }
}
class AA{}

class BB extends AA{}
