package com.hspedu.extends_.improve;
//输入ctrl + h可以看到类的继承关系
public class Sub extends Base{
    public Sub() {
//        细节1.创建对象时，子类会调用父类构造器完成父类初始化
//        super();当父类有无参构造器时，可以默认调用父类无参构造器
//        细节2 创建子类对象时，不管使用子类的哪个构造器，都会先调用父类的无参构造器，
//        如果父类没有提供无参构造器，则必须在子类的构造器中用super去显示指定使用父类的哪个构造器完成对父类的初始化
//        细节3 super必须放在构造器第一行，且只能在构造器中使用。
//        且由于this语句也只能放在构造器第一行，所以二者不能在同一个构造器使用
//        细节4 子类只能继承一个父类
        super("jack", 11);
        System.out.println("Sub无参构造器被调用");
    }

    public Sub(String a){
        super("Tom", 20);
        System.out.println("Sub(String a)构造器被调用");
    }

}
