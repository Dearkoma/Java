package Char与String之间的互换关系;

import java.util.Arrays;

public class StringTo {
    public static void main(String[] args) {
        String[][] arr = { { "eat", "ate", "tae" }, { "nat", "tan" }, { "bat" } };
        String[][] strs = new String[arr.length][];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = new String[arr[i].length];
            for (int j = 0; j < strs[i].length; j++) {
                char[] str = arr[i][j].toCharArray();
                Arrays.sort(str);
                String a = new String(str);
                strs[i][j] = a;
            }
        }

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length; j++) {
                System.out.print(arr[i][j]+":"+strs[i][j]+" ");
            }
            System.out.println();
        }
    }
}
