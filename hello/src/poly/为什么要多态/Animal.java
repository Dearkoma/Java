package poly.为什么要多态;

public class Animal {
    private String name;

    public Animal(String name) {
        //this.name = name;
        System.out.println("Animal");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cry(){
        System.out.println("动物在叫");
    }
    
}
