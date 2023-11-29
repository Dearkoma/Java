package koma.override_.overrideExercise;

public class overrideExercise {
    public static void main(String[] args) {
        person jack = new person("jack", 10);
        System.out.println(jack.say());
        Student smith = new Student("smith", 20, 1234, 99.8);
        System.out.println(smith.say());
    }
}
