package 学习;
import java.util.Scanner;
public class  重构{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Var v = new Var();
        System.out.println(v.shown(sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
        sc.close();
    }
}
class Var{
    public String shown(String str, double...scores){
        double nums = 0;
        for(int i=0;i<scores.length;i++)
            nums+=scores[i];
        return str + "有" + scores.length + "总分是:" + nums;
    }
}