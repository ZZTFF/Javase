public class Scope {
        public static void main(String[] args) {
        Cat cat = new Cat();
//        cat.say();
//        Person1 person = new Person1();
       Person1 person = new Person1();
       person.say();
       person.say1(cat);

        }
}
//全局变量也可以被其他类使用，通过创建其他类的对象的方法使用或着作为实参传入其他类
class Person1{
    public void say(){
        Cat cat = new Cat();
        cat.say();
        System.out.println("在Person1类中创建Cat类对象并直接调用Cat属性" + cat.age);
    }
    public void say1(Cat c){
        System.out.println("通过传入Cat类对象输出Cat属性为" + c.age);
        System.out.println("通过传入Cat类对象调用say方法输出Cat类属性为");
        c.say();
    }
}
class Cat{
    //全局变量，也就是属性，作用域为整个类中，类中方法都可直接使用
    //属性不赋值有默认值，局部变量没有
    int age  = 10;

    public void say(){
        //1. 局部变量一般指的是成员方法中定义的变量，完整的说指除了属性之外的变量

        //2. n的作用域在say方法中
        int n ;
        System.out.println("Cat类中say方法被调用输出Cat类中属性" + age);
        //System.out.println(n);
        //下面num也是局部变量
        {
            int num = 1;
        }
    }
}
//只有执行对应的方法或者代码块的时候，局部变量创建，执行完则销毁
//局部变量只能在对应方法中使用
