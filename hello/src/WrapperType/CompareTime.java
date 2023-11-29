package WrapperType;

public class CompareTime {
    public static void main(String[] args) {
        String s = "";
        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();
        long startime = 0L;
        long endtime = 0L;
        startime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            s += String.valueOf(i);
        }
        endtime = System.currentTimeMillis();
        System.out.println("String: " + (endtime - startime));
        startime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endtime = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (endtime - startime));
        startime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endtime = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (endtime - startime));
        System.out.println((int)(2+Math.random()*(7-2+1)));   //a+Math.random()*(b-a+1)生成a~b范围的整数
    }
}
