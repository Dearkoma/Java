package Enum;

public class Enumeration {
    public static void main(String[] args) {
        System.out.println(Season.S);
    }
}

class Season {
    private String name;
    private String desc;
    public static Season S = new Season("SPRING", "wennuan");
    public static Season W = new Season("Winter", "wennuan");
    public static Season A = new Season("AUto", "wennuan");
    public static Season D = new Season("Dong ", "wennuan");//创建Season类的对象 因为是static所以可以不是实例化直接使用  类似于  private int S =int值;
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }
    
    public String getDesc() {
        return desc;
    }
    @Override
    public String toString() {
        return "Season [name=" + name + ", desc=" + desc + "]";
    }
}