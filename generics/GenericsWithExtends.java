package generics;


import java.lang.annotation.Annotation;
import java.util.*;


public class GenericsWithExtends{
    public ArrayList<? extends Number> sum(List<Integer> i,List<Integer> i1){
        ArrayList<Double> b = new ArrayList<>();
        Iterator<Integer> it = i.iterator();
        Iterator<Integer> it1 = i1.iterator();
        double d = 0.0;
        while (it.hasNext() || it1.hasNext()){
            b.add((it.next()+it1.next())+d);
        }


        return b;
    }
    public static void main(String[] args) {

        ArrayList<Integer> in = new ArrayList<>();

        in.add(10);
        in.add(20);
        ArrayList<Integer> in2 = new ArrayList<>();
        in2.add(10);
        in2.add(20);
        Set<Set<? extends Number>> hs = new HashSet<Set<? extends Number>>();

        GenericsWithExtends gn = new GenericsWithExtends();
        Iterator<? extends Number> itrr = gn.sum(in, in2).iterator();
        while (itrr.hasNext()){

            System.out.println(itrr.next());
        }
   //    String obj = null;
//        if (obj == null || obj.toString()){
//            System.out.println("hr");
//        }


    }
}
