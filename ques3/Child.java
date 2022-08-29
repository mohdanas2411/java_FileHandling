package ques3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Child extends Parent implements Cloneable{
    int a;
    public static void fun() {
        System.out.println("Child class static");
    }
    public void fun1() {
        System.out.println("Child class fun1");
    }



//    void fun2(int a) {
//    super.fun();
//    int b =0;
//        System.out.println(b);
//
//    }
//    private void fun3(){
//        System.out.println("child fun3");
//    }


    public static void main(String[] args) throws IOException, CloneNotSupportedException {

        Child c = new Child();
        //Parent p = new Child();
        Child c1 =(Child) c.clone();
        System.out.println(c.hashCode()+" "+c1.hashCode());

        Parent child1 = new Child();
        System.out.println("yeyeyeyye");
        child1.fun1();
        /*  c.fun();
        c.fun1();
      //  c.fun2(5);
        //p.fun3();
        //c.fun3();
        System.out.println("hel");
        System.out.println(c.getClass());
        System.out.println(c.getClass().getName());
        System.out.println(c.getClass().getName()+"@"+Integer.toHexString(c.hashCode()));
        System.out.println(c.toString());
        System.out.println(c);
      //  System.out.println(c.getClass().newInstance());
        System.out.println(c.toString());
ArrayList
        p.fun1();

*/
    }


}
