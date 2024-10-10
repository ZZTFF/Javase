package com.hspedu.poly.detail;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public int age = 3;

    private void sayPrivate(){
        System.out.println("private cat method ");
    }
    void say(){
        System.out.println("cat method ");
    }

    protected void sayProtected(){
        System.out.println("protected cat method ");
    }

    public void sayPublic(){
        System.out.println("public cat method ");
    }

    private void sayPrivateCat(){
        System.out.println("private cat method ，the method name is  sayPrivateCat");
    }

    void sayCat(){
        System.out.println("cat method ，the method name is  sayCat");
    }

    protected void sayProtectedCat(){
        System.out.println("protected cat method ，the method name is  sayProtectedCat");
    }

    public void sayPublicCat(){
        System.out.println("public cat method ，the method name is  sayPublicCat");
    }


}
