package ques3;

import java.io.IOException;

public class Main {
    public Main() {

    }

    private void fun2(){

        System.out.println("hello");

    }
    public static void main(String[] args) throws IOException {
        Child c = new Child();
        c.fun();
        c.fun1();
        Parent p = new Child();
        p.fun();


    }
}
