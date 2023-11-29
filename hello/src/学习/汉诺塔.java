package 学习;
public class 汉诺塔 {
    public static void main(String[] args){
        hn h = new hn();
        h.move(5, 'A', 'B', 'C'); 
    }
}

class hn{
    public void move(int n,char i,char j,char k){
        if(n == 1){
            System.out.println("第" + n + i + "->" + k );
        }else {
            move(n-1, i, k, j);
            System.out.println("第" + n + "从" + i +"移动到" + j);
            move(n-1, k, i, j);
            System.out.println();
        }
    }
}
