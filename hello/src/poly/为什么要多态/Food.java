package poly.为什么要多态;

public class Food {
    private String name;

    public Food(String name) {//重构默认构造器
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
