package InheritanceAccessSpecifier;

import java.util.*;

final class Child{
    private final String name;
    private final int id;

    Child(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Child)) return false;
        Child child = (Child) o;
        return id == child.id && Objects.equals(name, child.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) throws Exception {
//        Child c = new Child(name, id);
//        Child c1 = new Child(name, id);
//        Map<Child,String> m = new HashMap<>();
//
//
//        m.put(c,"abc");
//        System.out.println(m.get(c));
//        c.setName("anas");
//        System.out.println(m.get(c));
//
//        m.put(c1,"abc");
//        System.out.println(m.get(c1));
//        c1.setName("anas");
//        System.out.println(m.get(c1));

    }
}
