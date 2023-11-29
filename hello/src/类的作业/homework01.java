package 类的作业;
public class homework01{
    public static void main(String[] args){
        //double[] nums = new double[5];
        double[] nums ={};//{1.1,5.11,9.5,6.1,7.5};
        A01 a = new A01();
        if(a.Max(nums) != null){   //为啥不能写(a.Max(nums))
        System.out.println("nums[]的最大数:" + a.Max(nums));
        }else {
            System.out.println("Null");
        }
    }
}
// class A01{
//     public double Max(double[] nums){
//         double res=nums[0];
//         for(int i=1;i<nums.length;i++){ //若nums里为空就报下标越界;
//             if(res<nums[i]){
//                 res = nums[i];
//             }
//         }
//         return res;
//     }
// }

class A01{
    public Double Max(double[] nums){
        if(nums.length>0){
            double res = nums[0];
            for(int i = 1; i<nums.length; i++){
                if(res<nums[i]){
                    res = nums[i];
                }
            }
            return res;
        }else return null;
    }
}