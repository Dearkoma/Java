package 类的作业;

public class homework10 {
    public static void main(String[] args) {
        
    }
}

class Employee {
    String name;
    char gender;
    int age;
    String job;
    double sal;

    public Employee(String job, double sal) {
        this.job = job;
        this.sal = sal;
    }

    public Employee(String name, char gender, double sal) {
        this.name = name;
        this.gender = gender;
        this.sal = sal;
    }

    public Employee(String name, char gender, int age, String job, double sal) {
        this(name, gender, sal);//使用前面的构造器;但是因为复用构造器时只能在第一条所以this(job,sal)无法使用
        this.age = age;
        this.job = job;
    }
}