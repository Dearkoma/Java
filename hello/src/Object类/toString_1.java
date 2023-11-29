package Object类;

import java.util.Scanner;

public class toString_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        double[] score = new double[n];
        double max,main;
        for(int i=0;i < n;i++){
            score[i] = (int )Math.random()*100;
            System.out.print(score[i] + "\t");
        }

        scan.close();
    }
}
