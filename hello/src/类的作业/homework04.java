package 类的作业;

public class homework04 {
    public static void main(String[] args) {
        int[] oldarr = { 10, 11, 12, 13 };
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(oldarr);
        System.out.println("复制情况");
        for (int i = 0; i < oldarr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}

class A03 {
    public int[] copyArr(int[] oldarr) {
        int[] newArr = new int[oldarr.length];
        for (int i = 0; i < oldarr.length; i++) {
            newArr[i] = oldarr[i];
        }
        return newArr;
    }
}