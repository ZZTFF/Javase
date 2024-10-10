package com.hspedu.extends_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel", "16", "1TB", "IBM");
        pc.printInfoBrand();
    }
}
class Computer{
     private String cpu;
     private String ram;
     private String hdd;

    public Computer() {
    }

    public Computer(String cpu, String ram, String hdd) {
        setCpu(cpu);
        setRam(ram);
        setHdd(hdd);
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getDetails() {
        return "cpu: " + cpu + ", ram: " + ram + ", hdd: " + hdd;
    }

}
class PC extends Computer{
    private String brand;

    public PC(String cpu, String ram, String hdd, String brand) {
        super(cpu, ram, hdd);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfoBrand() {
        System.out.println(getDetails() + ", brand: " + brand);
    }

}
class NotePad extends Computer{
     private String color;

    public NotePad(String cpu, String ram, String hdd, String color) {
        super(cpu, ram, hdd);
        this.color = color;
    }
    public void printInfoColor() {
        System.out.println(getDetails() + ", color: " + color);
    }
}
