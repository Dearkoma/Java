package langqiao;

import java.util.Arrays;

import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "ate", "tea", "nat", "tan", "bat"};

        Map<String, List<String>> map = new HashMap<>();

        // 遍历字符串数组
        for (String str : strs) {
            // 将字符串转换为字符数组并进行排序
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            // 将排序后的字符数组转换回字符串
            String sortedString = new String(charArray);

            // 将字符串添加到对应的Anagram分组中
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }

        // 将分组后的Anagrams转换为二维字符串数组
        String[][] result = new String[map.size()][];
        int index = 0;
        for (List<String> group : map.values()) {
            result[index++] = group.toArray(new String[group.size()]);
        }

        // 打印结果
        for (String[] group : result) {
            System.out.println(Arrays.toString(group));
        }
    }
}