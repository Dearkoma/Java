package HouseRent.Interface_1;

public class Interface {
    public static void main(String[] args) {
        Mysql mysql = new Mysql();
        System.out.println(mysql.n);
        t(mysql);
        Oracle oracle = new Oracle();
        t(oracle);
        System.out.println();
        bb bb = new bb();
        System.out.println(bb.ac);
    }

    public static void t(Dbinterface d) {
        d.contect();
        d.close();
    }
}

interface ab {
    int ac = 23;
} 

class bb implements ab {
    
}