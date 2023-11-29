package HouseRent.Interface_1;

public class Mysql implements Dbinterface {
    public void contect() {
        System.out.println("连接Mysql");
    }

    public void close() {
        System.out.println("关闭Mysql");
    }
}
