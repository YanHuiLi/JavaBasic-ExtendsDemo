package com.archer.extendsDemo;

/**
 * public 在整个工程中访问
 * private 只能在当前类中访问。
 * default 当前包中访问
 *
 * Created by Archer on 2016/3/26.
 */
public class ExtendsDemo02 {
    public static void main(String[] args) {
      B b=new B();
        b.tell();
    }

}


class A{

    //当子类复写了tell方法的时候，父类的方法就不会执行了
    public void tell(){

        System.out.println("我是tell方法");
    }



    void print(){

    }
}

class B extends A{

    //方法的重写。
    public void  tell(){
        //通过关键字super去调用父类的方法
        /**
         * super key word 强行调用父类的方法的执行
         */
        super.tell();


        System.out.println("我重写了tell方法");
    }

    //被子类重写的方法不能拥有比父类更加严格的访问权限
    //多数是一样的访问权限
    /**
    private void print(){

    }
    */
}