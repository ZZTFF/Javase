public class OOP {
    public static void main(String[] args) {

//        Person person1 = new Person();
//        person1.speak();
//        person1.cal02(10);
//        A a = new A();
//        a.sayOk();
//       MyTools myTools = new MyTools();
//        System.out.println(myTools.isOdd(6));
//        char[][] a = myTools.printChar(5,6,'*');
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
        Person person= new Person();
        person.name = "jack";
        person.age = 18;
        MyTools2 myTools2 = new MyTools2();
        Person a = myTools2.copyPerson(person);
        System.out.println(a.name);
        System.out.println(a.age);
        //比较是否是同一个对象
        System.out.println(person == a);
        }

    }
class Person {
    String name;
    int age;
    //方法名驼峰命名法，例如getSum，getSumAndSub
    public void speak(){
        System.out.println("我是人类!");
    }
    public void cal02(int n){
        System.out.println(n);
    }
    public void getSum(int num1, int num2){
    }
}
//同一个类中方法调用另外一个方法，直接调用即可。
class A{
    public void print(int n){
        System.out.println("print方法被调用，n = " + n);
    }
    public void sayOk(){
        print(10);
    }
}
//跨类中的方法调用，需要通过对象名调用，即需要实例化类。
//跨类的方法调用跟方法的访问修饰符有关。


class MyTools{
    public boolean isOdd(int n){
        return (n % 2 != 0);
     }

     public char[][] printChar(int row , int col, char c1) {
        char[][] a = new char[row][col];
         for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
                 a[i][j] = c1;
             }
             System.out.println();
         }
         return a;
     }
}
//对于基本数据类型，传递的是值，形参任何改变不影响实参！
//对于引用数据类型，传递的是地址，形参任何改变都会对应影响实参！对象是引用数据类型，也可以作为形参

//复制一个Person对象，返回复制的对象。两个对象完全独立
class MyTools2 {
    public Person copyPerson(Person person){
        Person person1 = new Person();
        //给name给的是地址，因为是字符串类型
        person1.name = person.name;
        //给age给的是具体的值
        person1.age = person.age;
        return  person1;
    }
}




