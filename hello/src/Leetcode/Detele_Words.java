package Leetcode;

public class Detele_Words {
    public static void main(String[] args) {
        String str = "ab#cccccc#d";//acccd;
        System.out.println(Detele(str, '#'));
    }

    public static String Detele(String str,char character) {
        int k=0;
        char[] arr = str.toCharArray();
        char[] brr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != character) {
                brr[k] = arr[i];
                k++;
            } else {
                if (k > 0) {
                    k--;
                }
            }
        }
        str = new String(brr);
        System.out.println(str);
        return str;
    }
                
}