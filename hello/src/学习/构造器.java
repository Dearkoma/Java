package 学习;
public class 构造器 {
    public static void main(String[] args){
        // Person s = new Person("alice");
        // Person S =new Person(10,"Alice");
        // // System.out.println("名字:" + s.name);
        // System.out.print("年龄:" + S.age + "名字" + S.name);
        Person ppp = new Person();
    }
}

class Person{
    int age;
    String name;
    // public Person(int Age,String Name){
    //     age = Age;
    //     name = Name;
    // }

    // public Person(String Pname) {
    //     name = Pname;
    // }
    public Person(){
        System.out.println("gouzaoq ");
    }
}
class Dog{
    /*
     * Dog(){
     * 默认构造器;
     * }
     */
}