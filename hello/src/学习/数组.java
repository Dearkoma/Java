package 学习;
import java.util.Scanner;

public class 数组 {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        System.out.println("输入A组大小:");
         int[] a=new int [sc.nextInt()];
        System.out.println("输入A组:");
        for(int i = 0;i < a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("A组完成输入如下:");
        for(int i = 0;i < a.length; i++){
            System.out.print(a[i] + "\t" );
        }
        System.out.println("\n是否增加?Y/N");
         char key= sc.next().charAt(0);
        while(key == 'Y' || key == 'y'){
            System.out .println("增加多少");
            int n = sc.nextInt();
            int count = 0;
            int[] b = new int [a.length+n];
            for(int k = 0;k <a.length;k++)
                b[k]=a[k];
            while(count<n){ //次数
                System.out .println("增加的数");
                int add = sc.nextInt();
                b[a.length + count]=add;
                count++;
            }
            a = b;
            System.out.println("是否继续添加Y/N");
            key = sc.next().charAt(0);
            if(key =='N' || key =='n')break;
        }
        for(int k = 0; k<a.length; k++){
            System.out.print(a[k]+ "\t");
        }
        System.out.println("finall!");
        System.out.println("是否排序?Y/N");
        key = sc.next().charAt(0);
        if(key == 'Y'|| key =='y'){
            for(int i = 0;i < a.length;i++){
                for(int j = 0;j < a.length-i-1;j++){
                    if(a[j]>a[j+1]){
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
        }else System.out.println("Final");
        for(int k = 0; k<a.length; k++){
            System.out.print(a[k]+ "\t");
        }
        System.out.println("\n是否插入数?Y/N");
        key =sc.next().charAt(0);
        if (key == 'Y'|| key == 'y'){
            System.out.println("插入的个数:");
            int n = sc.nextInt();
            int aNew[] = new int[a.length + n];
            // for(int i = 0 ;i < a.length;i++)
            //     aNew[i]=a[i];
            while(n-->0){
                System.out.println("输入");
                int num = sc.nextInt();
                int i,j;
                for(i = 0,j = 0; i<aNew.length;i++){
                    if(a[i]<num)
                        aNew[j++] = a[i];
                    else {aNew[j++] = num;break;}
                }
                while(j!=aNew.length){
                    aNew[j++]=a[i++];
                }
                a=aNew;
                }
            sc.close();
        System.out.println("final");
        for(int i = 0; i<a.length;i++)
            System.out.print(a[i] + "\t");
        }
    }
}