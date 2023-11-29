package Combinate;

public class HashMatSturcture {
    public static void main(String[] args) {
        Nodem[] table = new Nodem[16];
        System.out.println("table" + table);
        System.out.println("\n");
        Nodem johb = new Nodem("johb", null);
        table[2] = johb;
        Nodem john = new Nodem("john", null);
        johb.next = john;
        Nodem jim = new Nodem("jim", null);
        john.next = jim;
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
        System.out.println(table);//调用默认toString所以看不到值
        System.out.println(table.length);
    }
}

class Nodem {
    
    Object data;
    Nodem next;
    public Nodem(Object data, Nodem next) {
        this.data = data;
        this.next = next;
    }
    @Override
    public String toString() {
        return "Nodem [data=" + data + ","+" next=" + next + "]";
    }
    
}