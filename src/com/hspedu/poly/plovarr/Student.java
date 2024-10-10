package com.hspedu.poly.plovarr;

public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        setScore(score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
        return super.say() + "score:" + getScore();
    }

    public String study(){
        return getName() + " is studying java";
    }
}
