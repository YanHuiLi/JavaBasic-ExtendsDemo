package com.archer.extendsDemo;



/**
 * 继承的使用
 * Created by Archer on 2016/3/26.
 */
public class ExtendsDemo {


    public static void main(String[] args) {

         Student student=new Student();
        student.setAge(20);
        student.setName("Archer");
        student.setScore(100);

        student.tell();

    }
}

class Student extends Person{
    //分数

 public void tell()
 {
     System.out.println("姓名："+ getName()+"年龄："+getAge()+"分数："+getScore());
 }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private  int score;

}




class Person{

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  int age;

    private String name;




}