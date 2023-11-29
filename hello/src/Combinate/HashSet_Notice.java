package Combinate;

import java.util.Set;
import java.util.HashSet;

public class HashSet_Notice {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Lucy");
        set.add("abans");
        set.add(new Dog1("旺财"));
        set.add(new Dog1("旺财"));
        // set.add(new Dog("旺财"));
        System.out.println(set);
        System.out.println("\n");
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println(hashSet);
    }
}

class Dog1 {
    private String name;

    public Dog1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + "]";
    }
    
}
