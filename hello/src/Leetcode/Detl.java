package Leetcode;

public class Detl {
    public static void main(String[] args) {
        String str = "ab#c";//acccd;
        System.out.println(str.length());
        Detele(str, '#');
        String arr = "1\0\066";
        System.out.println(arr.length());
    }

    public static void Detele(String str,char character) {
        int len = str.length();
        char[] arr = new char[len];
        arr = str.toCharArray();
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != character) {
                arr[k] = arr[i];
                k++;
            } else {
                if (k > 0) {
                    k--;
                }
            }
        }
        arr[k] = '\0';
        str = new String(arr);
        System.out.println(arr);
        System.out.println(str);  
    }
}