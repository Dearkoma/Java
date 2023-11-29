package single;

public class SingleTon2 {
    public static void main(String[] args) {
        Cat cat = Cat.getCat();
        System.out.println(cat);
    }
}

class Cat {
    private String name;
    public static int n1 = 999;
    private static Cat cat;//默认为null

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getCat() {
        if (cat == null) {
            cat = new Cat("橘喵");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + "]";
    }
    //饿汉式单例Runtime
}


