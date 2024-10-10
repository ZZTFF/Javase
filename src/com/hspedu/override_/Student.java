package com.hspedu.override_;

public class Student extends Person {
    private String id;
    private double score;

    public Student(int age, String name, String id, double score) {
        super(age, name);
        setId(id);
        setScore(score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String say() {
//        return "I am " + name + " and I am " + age + " years old.";
//        return "Student " + getName() + " " + getAge() + " " + getId() + " "  + getScore();
        return super.say() + "my id is "+ getId() + "my score is" + getScore();//体现super的作用
    }
}
