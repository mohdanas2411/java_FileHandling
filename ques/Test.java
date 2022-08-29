package ques;

import jdk.jfr.Unsigned;
import myLinkedList.mySinglyLinkedList.MySinglyLinkedList;
import ques3.Parent;

import java.security.SignedObject;
import java.util.*;

public class Test implements Comparable{

    public static void main(String[] args) {
        HashSet<Employee> sc = new HashSet<>();
        System.out.println(new ArrayList<>().size());
        List<Integer> l = new ArrayList<>();

    
        sc.add(new Employee(1, "anas", "15-02-22", 50001.786));
        sc.add(new Employee(1, "anasaa", "15-02-22", 50001.786));

        sc.add(new Employee(2, "deepesh", "16-02-22", 50600.786));
        sc.add(new Employee(2, "deepesh", "16-02-22", 50600.786));

        sc.add(new Employee(3, "keshav", "17-02-22", 50400.786));
        sc.add(new Employee(3, "keshav", "17-02-22", 50400.786));

        sc.add(new Employee(4, "amrit", "18-02-22", 50200.786));
        sc.add(new Employee(4, "amrit", "18-02-22", 50200.786));

        sc.add(new Employee(5, "gaurav", "19-02-22", 51000.786));
        sc.add(new Employee(5, "gaurav", "19-02-22", 51000.786));

        int a = Integer.MAX_VALUE;


        try{
            System.out.println(10/1);
            throw new CustomException("ghhhh");
        }catch (ArithmeticException | CustomException e){
            e.getStackTrace();
        }

        System.out.println(sc);
        try {
           HashSet hs =  new HashSet();
           hs.add(101);

            Iterator<Employee> itr = sc.iterator();
            while (itr.hasNext()) {
                Employee em = itr.next();
                System.out.println("Reference id " + em +", hashcode " + em.hashCode() + " id :" + em.id + ", name :" + em.name + ", date :" + em.date + ", salary :" + em.salary);
            }
            System.out.println("set size " + sc.size());

        }
        catch (ArithmeticException e){


            System.out.println("Exception occur catch block hit");
        }
        catch (Exception e){
            System.out.println("Exception occur catch block hit");
        }
      finally {
            int x =10;
            System.out.println("b finally");

            try {
                System.out.println(x/0);
            }catch (ArithmeticException e){
                System.out.println(e instanceof Runnable);
            }

            System.out.println("A finally");
        }



    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
