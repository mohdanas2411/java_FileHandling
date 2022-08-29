package ques3;

import java.io.IOException;

public class Parent<U>{

    U id;
    public Parent() {
    }

    public static void fun() throws NullPointerException{
        System.out.println("Parent class static mm");
    }

   protected void fun1(){
        System.out.println("Parent class fun1 h");
    }

    private void fun3(){
        System.out.println("parent fun 3");
    }

    public U getId() {
        return id;
    }

    public void setId(U id) {
        this.id = id;
    }
}
