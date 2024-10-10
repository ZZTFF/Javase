public class ThisDetail {
    public static void main(String[] args) {
        T t = new T();//这里会使用public T()构造器


    }
}
//细节1. this访问构造器语法：this(参数列表)，
//继上，只能在构造器中使用（即只能在构造器访问另外一个构造器），且必须放在第一条语句


class T{
    public T(){
            this("jack", 100);
            System.out.println("T构造器");
    }
    public T(String name, int age){
        System.out.println("String name, int age构造器被调用");
    }

}



