package koma.源码;

public class Account {
    
        private String name;
        private double balance;
        private String pwd;

        
        public Account() {//为了主方法的定义时可以不马上写实参;
        }
        
        public Account(String name, double balance, String pwd) {
            this.setName(name);
            this.setBalance(balance);
            this.setPwd(pwd);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if(name.length()>=2&&name.length()<=6){
                this.name = name;
            } else {
                System.out.println("Error");
                this.name = "无名人";
            }
        }
        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if(balance>20){
                this.balance = balance;
            } else {
                System.out.println("错误");
                this.balance = 0;
            }
        }
        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            if (pwd.length() == 6) {
                this.pwd = pwd;
            } else {
                System.out.println("密码错误");
                this.pwd = "000000";
            }
        }

        public void info() {
            System.out.println("账户:" + name + "薪水: " + balance + "密码:" + pwd);
        }
        
}
