package com.hspedu.poly.detail;

public class Animal {
    private String name;
    public int age = 10;

    public Animal(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private void sayPrivate(){
        System.out.println("Private Animal Method");
    }
     void say(){
        System.out.println("Animal Method");
    }
    protected void sayProtected(){
        System.out.println("Protected Animal Method");
    }
    protected void sayPublic(){
        System.out.println("Public Animal Method");
    }

    public void test(){
        System.out.println("test");
    }

}
