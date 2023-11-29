package langqiao;
import java.util.Scanner;

// 1:无需package
// 2: 类名必须Main, 不可修改

// public class ABS {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n =scan.nextInt();
//         int[] arr=new int[n];
//         int max;
//         int min = max = 0;
//         int dex1 = 0;
//         int dex2 = 0;
//         for(int i=0;i<n;i++){
//             arr[i] = scan.nextInt();
//             if (max < arr[i]) {
//                 max = arr[i];
//                 dex1 = i;
//             } else if(min > arr[i]){
//                 min = arr[i];
//                 dex2 = i;
//             }
//         }
//         int res =(Math.abs(max - min))+(int)(Math.abs(dex1 - dex2)) ;
//         System.out.println(res);
//         scan.close();
//     }
// }
// import java.util.*;
// public class ABS {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a=new int[n+1];
//         int max=1;
//         for (int i = 1; i <= n; i++) {
//             a[i]=sc.nextInt();
//         }
//         for (int i = 1; i <= n; i++) {
//             for (int j = i+1; j <= n; j++) {
//                 int b=Math.abs(i-j)+Math.abs(a[i]-a[j]);
//                 if (b>max) {
//                     max=b;
//                 }
//             }
//         }
//         System.out.println(max);
//     }
// }
public class ABS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int max = 0;
       
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int res = (Math.abs(j - i)) + (int) (Math.abs(arr[i] - arr[j]));
                if (res > max) {
                    max = res;
                }
            }
        }
        System.out.println(max);
    }
}