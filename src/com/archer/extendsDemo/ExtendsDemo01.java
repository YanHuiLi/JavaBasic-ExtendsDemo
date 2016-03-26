package com.archer.extendsDemo;

import com.sun.org.apache.xpath.internal.SourceTree;
import sun.management.Agent;

/**
 * java单继承
 * Created by Archer on 2016/3/26.
 * 子类不能得到父类的私有成员变量，只能通过set，get方法得到。
 *
 *
 */
public class ExtendsDemo01 {
    public static void main(String[] args) {
        Worker worker=new Worker();
        worker.setAge(100);
        worker.tell();

    }
}


class People{
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


}

class Worker extends People{


    public void tell(){
        System.out.println(getAge());
    }

}

//class PetWorker extends Worker{
//
//    public void tell(){
//     System.out.println(age);

