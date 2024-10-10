package com.hspedu.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person(20,"jack");

        Student student = new Student(10,"Tom", "0001", 100);
        System.out.println(person.say());
        System.out.println(student.say());

    }
}
