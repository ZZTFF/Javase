public class Constructor {
    public static void main(String[] args) {
        Person2 p1 =  new Person2(18, "jack");
        System.out.println(p1.age + " " + p1.name);
        Person2 p2 =  new Person2(18 );
        //有默认值
        System.out.println(p2.age + " " + p2.name);

        Person2 p3 =  new Person2();//必须使用默认无参构造器或者显式定义

    }
}
class Person2 {
    int age;
    String name;
    //1. 构造器没有返回值   2. 构造器名字和类名相同
    public Person2(int Age, String Name) {
        System.out.println("构造器1被调用了");
        age = Age;
        name = Name;
    }

    //细节1. 构造器方法可以重载
    public Person2(int Age) {
        System.out.println("构造器2被调用了");
        age = Age;

    }

    //一旦有了自己的构造器，会覆盖原本默认的构造器，此时就无法无参数初始化一个对象
    //除非再 显式的声明默认构造器
    Person2(){}
}
