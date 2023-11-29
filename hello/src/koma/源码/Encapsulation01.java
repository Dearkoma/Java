package koma.源码;

import java.util.Scanner;

public class Encapsulation01 {
    
    public static void main(String[] args){
        Person person = new Person();
        person.name = "ALice";
        person.setAge(30);
        person.setSalary(person.getSalary());
        System.out.println(person.show());
        Person alic = new Person("alice", 1000, 3000);
        System.out.println(alic.show());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=6){
            this.name = name;
        } else {
            System.out.println("Error (2-6)");
            this.name = "null";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄错误(1-120)");
            this.age = 18;
        }
    }

    public double getSalary() {
        Scanner sc = new Scanner(System.in);
        if (sc.nextInt() == 1) {
            sc.close();
            return 3000;
        } else {
            System.out.println("Error");
            sc.close();
            return 0;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String show() {
        return "信息:" + name + "年龄:" + age + "薪水: " + salary;
    }
    
    public Person() {
    }
    //有三个属性的构造器
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        //将set方法写在构造器中,还可以验证,改变属性;
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    
}