package Enum;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.S);
    }
}

enum Season2 {
    SPRING("chunegt","666"),Winter("6566","4545"),AUTUMO("qiu","re");
    private String name;
    private String desc;
    private Season2(String name, String desc) {
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
        return "Season2 [name=" + name + ", desc=" + desc + "]";
    }
}