package Object类;

public class equals_01 {
    public static void main(String[] args) {
        "hello".equals("world");
        Integer integer = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer == integer2);
        System.out.println(integer.equals(integer2));

}
class A{

}
class B extends A{
    }
}
/*
 * public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        return (anObject instanceof String aString)&& (!COMPACT_STRINGS || this.coder == aString.coder)&& StringLatin1.equals(value, aString.value);
    }
 */