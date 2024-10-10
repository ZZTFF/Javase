package com.hspedu.Codeblock;

public class CodeBlock {
    public static void main(String[] args) {
        Movie movie1 = new Movie("我不是药神");
        Movie movie2 = new Movie("ABC", "jack");

    }
}

class Movie{
    private String name;
    private String director;
//把多个构造器中相同部分拿出来写到代码块中，优先于构造器被调用
    static {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    };


    public Movie(String name) {
        System.out.println("Movie(String name)");
        this.name = name;
    }

    public Movie(String name, String director) {
        System.out.println("Movie(String name,director)");
        this.name = name;
        this.director = director;
    }
}

