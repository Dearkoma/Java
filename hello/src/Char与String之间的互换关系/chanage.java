package Char与String之间的互换关系;

import java.util.Arrays;

public class chanage {
    public static void main(String[] args) {
        String[][] arr = { { "eat", "ate", "tae" }, { "nat", "tan" }, { "bat" } };
        String[][] strs = new String[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            strs[i] = new String[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                char[] chanage = arr[i][j].toCharArray();
                Arrays.sort(chanage);
                String str = new String(chanage);
                strs[i][j] = str;
            }
        }
        for (String[] row : strs) {
            System.out.println(Arrays.toString(row));
        }
    }
}
