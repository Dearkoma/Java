package 学习;
import java.util.Scanner;

public class 方式 {
    public  static void main(String[] args){
        A a = new A();
        a.print1();

    }
}
class  A{

    public int way(int n){
        //int sum=0,f1=0,f2=1;
        //斐波拉契数列
        // for(int i=1;i<n;i++){
        //     sum=f1+f2;
        //     f1=f2;
        //     f2=sum;
        // }
        int sum=0;
        if (n == 0|| n == 1){
            return n;
        }else return sum+=way(n-1)+way(n-2);
        //return sum;
    }
    public void print1(){
        System.out.print("A方法开始");
        B b = new B();
        A aa= new A();
        b.aa();
        aa.print2();
    }

    public void print2(){
        System.out.println("A结束");
    }
}
class B{

    public  void aa(){
        Scanner sc= new Scanner(System.in); 
        A Aa=new A();
        System.out.println("b开始" + Aa.way(sc.nextInt()));
        sc.close();
    }
}