package Try;
import java.util.Arrays;

public class ACme {
   public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5};
       System.out.println(minOperations(arr));
   }

   public static int minOperations(int[] arr) {
       int n = arr.length;
       long sum = 0;
       for (int num : arr) {
           if (num != 0) {
               sum += num;
           }
       }

       if (sum == 0) {
           return -1;
       }

       long target = sum / n;
       if (target == 0) {
           return -1;
       }

       int count = 0;
       for (int num : arr) {
           if (num != 0) {
               long diff = Math.abs(num - target);
               if (diff % 2 == 1) {
                   return -1;
               }
               count += diff / 2;
           }
       }
       return (int) count;
   }
}
/*public class Main {
   public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
       groupSameElements(arr);
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
   }

   public static void groupSameElements(int[] arr) {
       int[] temp = new int[arr.length];
       int index = 0;
       for (int i = 0; i < arr.length; i++) {
           if (i == 0 || arr[i] != arr[i - 1]) {
               temp[index++] = arr[i];
           }
       }
       for (int i = 0; i < index; i++) {
           arr[i] = temp[i];
       }
   }
} */