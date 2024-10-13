//注释
public class VarParameter {
    public static void main(String[] args) {
        HspMethod hm = new HspMethod();
        hm.sum();
        System.out.println(hm.sum(1,2,3,4,5));
        //细节1 可变参数实质上就是数组，因此可以直接数组作为实参
        int[] arr = {1, 2, 3, 4};
        System.out.println(hm.sum(arr));

        HspMethod a = new HspMethod();

        System.out.println(a.showScore(a.showScore("jack", 68, 49)));
    }
}
//多个同名同功能但参数个数不同的方法，封装成1个方法，通过可变参数优化
//1. int...表示接受的是可变参数，类型是int，即可以接受多个int（0到多）
//2. 使用可变参数时，可以当作数组来使用
class HspMethod{
        public int sum(int... nums){
            //System.out.println(nums.length);
            int sum = 0;
            for(int i = 0; i < nums.length; i++){
                sum += nums[i];
            }
            return sum;
        }
        //细节2 可变参数可以和普通类型参数一起放形参列表，但可变参数必须在后面
        public void f1(int n, int... nums){

        }
        //细节3 一个形参列表只能有一个可变参数
//        public void f1(int... nums1, int... nums){
//
//        }
        public String showScore(String name, double... scores){
            int length = scores.length;
            double sumScore = 0;
            for(int i = 0; i < scores.length; i++){
                sumScore += scores[i];
            }
            return name + ' ' + length + "门课的总成绩为"+ sumScore;
        }


}
