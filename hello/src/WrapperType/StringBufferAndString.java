package WrapperType;

public class StringBufferAndString {
    public static void main(String[] args) {
        String str = "abcd";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2 = stringBuffer2.append(str);
        StringBuffer stringBuffer3 = new StringBuffer("java");
        String s = stringBuffer3.toString();
        String string = new String(stringBuffer3);
    }
}
