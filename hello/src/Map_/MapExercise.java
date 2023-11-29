package Map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map set = new HashMap();
        set.put(1,new Employee(1,"zyx",100));
        set.put(2,new Employee(2,"clq",225));
        set.put(3, new Employee(3, "lwl", 230));
        System.out.println("============a=============");
        for (Object obj : set.keySet()) {//先获取set的key,然后遍历所有的key,将set中对应的key所对应的value转换成Employee然后再输出
            Employee emp = (Employee) set.get(obj);
            if (emp.getSalary() > 180) {
                System.out.println(emp);
            }
        }
        Set entry = set.entrySet();
        Collection col = set.entrySet();
        // System.out.println(entry);
        // System.out.println(col);
        System.out.println();
        System.out.println();
        Iterator itor = col.iterator();
        System.out.println("Iterator");
        Iterator itor1 =entry.iterator();
        while (itor.hasNext()) {
            Map.Entry entry1 = (Map.Entry) itor;
            Employee emp = (Employee) entry1.getValue();
            if (emp.getSalary() > 180) {
                System.out.println();
            }
            System.out.println((Map.Entry)itor.next());
        }
        System.out.println();
        // System.out.println("Map.Entry");
        // itor = col.iterator();
        // while (itor.hasNext()) {
        //     Map.Entry entry1 = (Map.Entry) itor.next();
        //     Employee emp = (Employee) entry1.getValue();
        //     if (emp.getSalary() > 180) {
        //         System.out.println(emp);
        //     }
        //     //System.out.println((Map.Entry)itor.next());
        // }
        System.out.println();
        System.out.println("Plus for");
        for (Object o : entry) {
            System.out.println(o);
        }
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}