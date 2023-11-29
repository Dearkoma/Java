package koma.源码;

public class TeatAccount {
    public static void main(String[] args){
        Account account = new Account();
        account.setName("Alice");
        account.setBalance(60);
        account.setPwd("123456");
        account.info();
    }
}
