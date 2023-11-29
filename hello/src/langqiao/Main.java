package langqiao;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        int[]a=new int[t];
        for(int i=0;i<t;i++){
            a[i]=scan.nextInt();
        }
        int w=0;
        while(w<t){
            int x=0;
            for(int i=1;i<a[w];i++){
                for(int j=1;j<a[w];j++){
                    if(Math.pow(i,j)==a[w])
                    {
                        x=1;
                    }
                }
            }
            if(x==1)System.out.println("Yes");
            else
                System.out.println("No");
            w++;
        }

    }
}