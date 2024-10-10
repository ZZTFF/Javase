public class BuBBLESort {
    public static void main(String[] args) {
        //冒泡排序
        int[] a = {24, 69, 80, 57, 13 };
        int temp;
        for(int i = 1; i <= a.length - 1; i++) {
            for(int j = 0; j < a.length - i; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }

        //
    }
}
