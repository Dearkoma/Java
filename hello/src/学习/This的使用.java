package 学习;
//import java.util.Scanner;
public class This的使用 {
    public static void main(String[] args){
        person_this s1 = new person_this(10, "ALice");
        person_this s2 = new person_this(10, "ALice");
        System.out.print("S1和S2是否相同:" + s1.compareTo(s2));
        // Scanner sc = new Scanner(System.in);
        // s.Per(sc.nextInt(),sc.nextLine());
        // System.out.print("年龄:" + s.age + "名字" + s.name);
        // sc.close();

    }
}

class person_this{
    int age;
    String name;
    public   person_this(int age, String name){
        this.age= age;
        this.name= name;
    }
    public boolean compareTo(person_this P){
        return this.age == P.age&& this.name.equals(P.name);
    }
}
