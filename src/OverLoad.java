public class OverLoad {
    public static void main(String[] args) {
//        MyCalcuator myCalcuator = new MyCalcuator();
//        System.out.println(myCalcuator.caculate(1, 2, 2));
        Methods methods = new Methods();
        System.out.println(methods.max(1.0, 2.0, 1.5));
    }
}
//方法重载即是同一个类中方法必须是同名，但形参列表必须不同（个数或类型或顺序）,参数名没有要求，返回类型不影响。
//即只要方法名一样，形参列表不同即可构成
class MyCalcuator{
    public int caculate(int n1, int n2){
        return n1+n2;
    }
    //如下就不叫构成重载
//    public int caculate(int a, int b){
//        return a+b;
//    }
    public double caculate(int n1, double n2){
        return n1+n2;
    }
    public double caculate(double n1, int n2){
        return n1+n2;
    }
    public int caculate(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
}
class Methods{
    public int max(int a, int b){
        return  a > b ? a : b;
    }
    public double max(double a, double b){
        return a > b ? a : b;
    }
    public double max(double a, double b, double c){
        double max = a > b ? a : b;
        return max > c ? max : c;
    }
}

