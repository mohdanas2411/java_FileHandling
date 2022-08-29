package ques2;

import ques.Employee;

import java.util.ArrayList;
import java.util.List;

interface aa{
    static void aaA(){
        System.out.println("ddd");
    }
}
public class Child extends Parent implements aa{

    public Child(){

        this("hello");
    }
    public Child(String str){

        System.out.println(str);
    }

    public void fun9() {
        System.out.println("un9");
    }

public void hello(){
    System.out.println("ff");
}
    public static void anas(){
        System.out.println("child class");
    }



    public static void main(String[] args) {
       // Parent c = new Child();
        Parent c = new Parent() {
            @Override
            public void fun9() {

            }
        };

        c.anas();
        Parent.anas();
       // c.fun1();
     //   c.fun9();

        Child child = new Child();
      //  child.aaA();

       List<Employee> list = new ArrayList<>();
       list.add(new Employee(12,"hello","12/11/22",12000));
        list.add(new Employee(13,"kehav","12/11/22",12000));
        list.add(new Employee(14,"Mahur","12/11/22",12000));
        list.add(new Employee(15,"kehav","12/11/22",12000));
Employee temp = null;
int i =0;
        for (Employee e : list) {
            if (e.getName().equalsIgnoreCase("Mahur")){
                temp = e;
                list.remove(e);
            }
            i++;
        }
       // list.add(0,temp);
        System.out.println(list);
    }
}
