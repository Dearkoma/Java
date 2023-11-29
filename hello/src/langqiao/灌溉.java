package langqiao;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 灌溉 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int t=sc.nextInt();//t个水管
        int a[][]=new int[n+1][m+1];
        a[sc.nextInt()][sc.nextInt()]=2;
        a[sc.nextInt()][sc.nextInt()]=2;
        int k=sc.nextInt();//k分钟后
        int sum=t;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(a[i][j]==2 ) {
                    if(i-1>=1 && a[i-1][j]==0) {a[i-1][j]=1; sum++;}//上
                    if(j-1>=1 && a[i][j-1]==0) {a[i][j-1]=1; sum++;}//左
                    if(i+1<=n && a[i+1][j]==0) {a[i+1][j]=1; sum++;}//下
                    if(j+1<=m && a[i][j+1]==0) {a[i][j+1]=1; sum++;}//右
                }
            }
        }
        System.out.println(sum);
    }
}