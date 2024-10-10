//递归调用
public class Recursion {
    public static void main(String[] args) {
         AAA aaa = new AAA();
//         aaa.test1(10);
//         int res = aaa.factorial(5 );
//        System.out.println(res);
//        int res = aaa.factorial2(6);
//        System.out.println(res);
        Tower t = new Tower();
        t.move(5, 'a' ,'b' ,'c');
    }

}
class AAA{
    public void test1(int n){
        if(n > 2){
            test1(n - 1 );
        }
        System.out.println("n = " + n);
    }
    public int factorial(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    //斐波那契数列
    public int factorial2(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return factorial2(n-1) + factorial2(n-2);
        }
    }
}
//汉诺塔问题，将一定数量的圆盘从A借助B移动到C,这些圆盘本来在A上。
class Tower{
    public void move(int num, char a, char b, char c){
        //一个盘子不需要借助额外的柱子
        if(num == 1)
        {
            System.out.println(a + "->" + c);
        }
        //如果有>=2个圆盘，则无法直接从原始位置移动到目标位置，必须借助额外的柱子
        else{
            //此时将A中圆盘看为两部分，最下面一个圆盘和上面所有圆盘，则需要将
            //上面num-1个圆盘借助c移动到b，并将最下面的圆盘直接移动到c。
            //最后将在b柱上的num-1个圆盘借助a移动到c。代码结束
            //递归最重要的思考是从最接近最后一步的操作开始想，并且把最开始的初始值定义好。
            //在代码中就只需要写清楚最后一步的操作对应的代码以及初始值定义即可。
            move(num -1 , a, c, b);
            System.out.println(a + "->" + c);
            move(num-1, b, a, c);
        }

    }
}