package comparator_comparable;

import ques3.Parent;

import java.util.ArrayList;
import java.util.Collections;

public class Test<K> {

    K id;
    String name;

    public Test(K id, String name) {
        this.id = id;
        this.name = name;
    }
    public void fun5(){
        System.out.println("hello");
    }


    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList al2 = new ArrayList();

        Test t1 = new Test("hrllo","anas");
        Test t2 = new Test(2,"an");
        Test t3 = new Test(3,"ana");
        Test t4 = new Test(4,"a");

        al.add(t1);
        al.add(t2);
        al.add(t3);
        al.add(t4);


      //  Collections.sort(al);
        System.out.println(al);
    }
}
