package langqiao;
import java.util.Scanner;

import java.util.Arrays;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class reso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int x = scan.nextInt();
        int[] a = new int[x];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        int[] b = delete(a);
        System.out.println(b.length);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        scan.close();
    }

    public static int[] delete(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        Arrays.sort(arr);
        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        // 2. 排序：将去重后的数组进行排序
        //Arrays.sort(arr, 0, slow + 1);快慢双指针
        return Arrays.copyOf(arr, slow + 1);
    }
}