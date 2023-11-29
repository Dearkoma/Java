package single;

public class SingleTon1 {
    public static void main(String[] args) {
        
        GirlFriend friend = GirlFriend.getFriend();
        System.out.println(friend);
    }
}

class GirlFriend {
    private String name;

    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    };

    private static GirlFriend gr = new GirlFriend("小红");
    
    public static GirlFriend getFriend() {
        return gr;
    }

    @Override
    public String toString() { 
        return "GirlFriend [name=" + name + "]";
    }
    //Runtime
}