package koma.extend;

public class Extend {
    public static void main(String [] args) {
        Pupil pupil = new Pupil();
        pupil.name = "Alice";
        pupil.age = 18;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        Granduate granduate = new Granduate();
        granduate.name = "Koma";
        granduate.age = 20;
        granduate.testing();
        granduate.setScore(100);
        granduate.showInfo();
    }
}
