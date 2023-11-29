package Enum;

public class Enumeration02 {
    public static void main(String[] args) {
        Week[] week = Week.values();
        for (Week values : week) {
            System.out.println(values);
        }
        
    }
}

enum Week {
    WEEK1("星期一"),WEEK2("星期二"),WEEK3("星期三"),WEEK4("星期四");
    private String day;

    private Week(String day) {
        this.day = day;
    }

    public String toString() {
        return day;
    }
}