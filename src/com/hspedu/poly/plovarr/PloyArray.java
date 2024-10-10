package com.hspedu.poly.plovarr;
//多态数组
public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("jack", 18);
        persons[1] = new Teacher("jane", 22, 10000);
        persons[2] = new Student("james", 22, 100);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if (persons[i] instanceof Teacher) {
//                ((Teacher)persons[i]).teaching();
                Teacher teacher = (Teacher) persons[i];
                System.out.println(teacher.teaching());
            }
            else if (persons[i] instanceof Student) {
//                ((Student)persons[i]).study();
                Student student = (Student) persons[i];
                System.out.println(student.study());
            }
            else if (persons[i] instanceof Person) {
            }
            else{
                System.out.println("你输入的类型有误");
            }
        }

    }
}
