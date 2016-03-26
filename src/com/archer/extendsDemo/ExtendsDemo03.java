package com.archer.extendsDemo;

/**
 * Created by Archer on 2016/3/26.
 * 先调用父类的构造方法再调用子类的构造方法。
 *
 */
public class ExtendsDemo03 {
    public static void main(String[] args) {

        Son son=new Son();

    }
}

class Father{
    public Father() {
        System.out.println("父类的构造方法");

    }

    private int age;
    private String name;

}

class Son extends Father{
    public Son() {
        System.out.println("子类的构造方法");
    }
}
