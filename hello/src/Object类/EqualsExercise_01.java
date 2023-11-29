package Object类;

public class EqualsExercise_01 {
    public static void main(String[] args) {
        Person person = new Person("ALice", 20, "女");
        Person person2 = new Person("ALice", 20, "女");
        System.out.println(person == person2);     //比较对象的引用是否相同,不相同,false;
        System.out.println(person.equals(person2));//false 默认为Object类的equals 相当于this == obj,和上面==一样person,person2为不同变量false,重写之后正常了.
    }
}

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public boolean equals(Object obj) {
        if (this == obj) { //this 为当前类的对象引用
            return true;
        }
        if (obj instanceof Person) { //是Person,才比较
            Person p = (Person) obj; //需要得到Obj的属性,进入更深一步的判断;
            return this.name.equals(p.name) && this.age == p.age && this.gender.equals(p.gender);
        }
        return false;
    }
}
