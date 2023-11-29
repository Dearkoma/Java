package poly.为什么要多态;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal, Food food) {
        System.out.println("主人" + name + "给 " + animal.getName() + "喂 " + food.getName());
    }
    // public void feed(Dog dog, Bone bone) {
    //     System.out.println("主人" + name + "给 " + dog.getName() + "喂 " + bone.getName());
    // }
    // public void feed(Cat cat, Fish fish) {
    //     System.out.println("主人" + name + "给 " + cat.getName() + "喂 " + fish.getName());
    // }
}
