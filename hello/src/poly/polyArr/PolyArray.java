package poly.polyArr;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Alice", 18);
        persons[1] = new Student("Alice", 18, 100);
        persons[2] = new Student("smith", 19, 120.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("King", 50, 25000);
        for (int i = 0; i < 5; i++) {
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {
                //Student student = (Student) person[i];
                //student.student();
                ((Student) persons[i]).student();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teacher();
            } else if(persons[i] instanceof Person){

            } else {
                System.out.println("类型有误");
            }
        }
    }
}
