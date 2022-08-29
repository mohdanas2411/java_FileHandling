package com.company;
//
//class child {
//    int a = 10;
//    protected long fun() {
//        System.out.println("parent");
//        return 0;
//    }
//}

//public class Main extends child {
    //int a = 100;
public class Main{

    String name;

    public Main(String name) {
        this.name = name;
    }

    public long fun() {

        System.out.println("fun child");

        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        Main m = new Main();
//        child c = new Main();
//        m.fun();
        //c.fun();
        //System.out.println(c.a);
    //    System.out.println(m.a);
        Main m = new Main("anas");
        System.out.println(m);
        System.out.println(m.toString());
        System.out.println(m.name);
        m.setName("aa");
        System.out.println(m.name);
        System.out.println(m.toString());
    }
}
