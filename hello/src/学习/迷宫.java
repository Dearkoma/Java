package 学习;
public class 迷宫 {
    public static void main(String[] args){
        int[][] map = new int[8][8];//0为可走,1为不可走
        for(int i=0;i< 8 ;i++)
            for(int j=0;j<8;j++)
            if(j==0||j==7){
                map[i][j]=1;
            }else if (i==0||i==7)map[i][j]=1;
        map[3][1]=1;
        map[3][2]=1;
        T t1=new T();
        t1.print(map, 0, 0);
        t1.findWay(map, 1, 1);
        System.out.println("\n\n========结果========");
        t1.print(map, 0, 0);
    }
}
//0可以走,1不可以走,2走完,3走不到
class T{
    public boolean findWay(int[][] map,int i,int j){
        if(map[6][6] == 2 ){
            return true;//已经找到
        }else {
            if(map[i][j] == 0){
                    map[i][j] = 2;
                if(findWay(map, i+1, j)){
                    return true;
                }else if(findWay(map,i,j+1)){
                    return true;
                }else if(findWay(map,i-1,j)){
                    return true;
                }else if(findWay(map,i,j-1)){
                    return true;
                }else  {
                    map[i][j] = 3;
                    return false; 
                }       
            }
            else return false;
        }
    }
    public void print(int[][] map,int i,int j){
    for(int a=0;a< 8 ;a++){
            for(int b=0;b<8;b++)
            System.out.print(map[a][b]);
            System.out.println();
        }
    }
}
