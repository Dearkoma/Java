package Combinate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //List c = new ArrayList();
        //Vector c = new Vector();
        c.add(new Dog("jack", 10));
        c.add(new Dog("jack", 10));
        c.add(new Dog("jack", 10));
        Iterator itor = c.iterator();
        while (itor.hasNext()) {
            System.out.println(itor.next());
        }
        System.out.println("\n");
        for(Object obj:c){
            System.out.println(obj);
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + "]";
    }
    
}
