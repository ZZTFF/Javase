
public class this1 {
    public static void main(String[] args) {
        int n = 1 + 2;
        Person3 p1 = new Person3(18, "jack");

    }
}
//可以想像初始化对象的时候有一个this属性，this会指向该对象，
// 因此当一个对象调用构造方法时，就可以写作this.name = name
//哪个对象调用，this就指向哪个对象

class Person3 {
    int age;
    String name;

    public Person3(int age, String name) {
        //无法直接写为age = age；name = name；因为会默认认为是局部变量，而不是属性了
        //因此引出this
//        age = Age;
//        name = Name;
        this.age = age;
        this.name = name;
    }


}