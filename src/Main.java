//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * @author ztf
 * @version 1.0
 */

public class Main{
      public static void main(String[] args){
//            Scanner myScanner = new Scanner(System.in);
//
//            char c1  = myScanner.next().charAt(0);
//            switch(c1){
//                  case 'a':
//                        System.out.println("A");
//                        break;
//                  case  'b':
//                        System.out.println("B");
//                        break;
//                  default:
//                        System.out.println("C");
//            }
//            char c1 = 10000;
//            int a = c1;
//            System.out.println(a);
            //Scanner myScanner = new Scanner(System.in);
//            double score = 101;
//            if(score >= 0 && score <= 100) {
//                  switch ((int) (score / 60)) {
//                        case 0:
//                              System.out.println("不及格");
//                              break;
//                        case 1:
//                              System.out.println("及格");
//                              break;
//                  }
//            }
//            else{
//                        System.out.println("输入成绩不对");
//                  }
//                  int month = 1;
//                  switch(month){
//                        case 12:
//                        case 1:
//                        case 2:{
//                              System.out.println("冬季");
//                              break;
//                        }
//
//                  }
//            int i = 1;
//            do{
//                  System.out.println(i);
//                  i++;
//            }while (i <= 10);
//            char c1;
//                  do{
//                    System.out.println("老韩使出五连鞭！");
//                    System.out.println("老韩说:还钱吗？y/n");
//                    Scanner myScanner = new Scanner(System.in);
//                    c1 = myScanner.next().charAt(0);
//              }while(c1 == 'n');
//            int j = 0;
//            j++;
////            int a = j++; // a 被赋值为 0，j 变为 1
////            int b = j = j + 1; // b 被赋值为 2，j 也变为 2
////            System.out.println(a);
//            System.out.println(j);
//            for(int i = 1; i <= 9; i++){
//                  for(int j = 1; j <= i; j++){
//                        System.out.print(j +" " + "*" + " " + i + " " + "=" + " " + i*j + "\t");
//                  }
//                  System.out.println();
//            }


              //打印实心金字塔，做的复杂了。
//            Scanner sc = new Scanner(System.in);
//            System.out.println("请输入层数：");
//            int totalLevel = sc.nextInt();
//            for(int j = 1; j <= totalLevel; j++){
//                  for(int i = 1; i <= (2*totalLevel-1)-(2*j-1)/2 + (2*j-1) ; i++){
//                        if(i < (2*totalLevel-1)-(2*j-1)/2 +1){
//                              System.out.print(" ");
//                        }
//                        else{
//                              System.out.print("*");
//                        }
//                  }
//                  System.out.println();
//            }




//
//            //打印空心金字塔
//            Scanner sc = new Scanner(System.in);
//            System.out.println("请输入层数：");
//            int totalLevel = sc.nextInt();
//            for(int j = 1; j <= totalLevel; j++){
//                  for(int i = 1; i <= (2*totalLevel-1)-(2*j-1)/2 + (2*j-1) ; i++){
//                        if(j != totalLevel){
//                              if(i == (2*totalLevel-1)-(2*j-1)/2 + 1 || i == (2*totalLevel-1)-(2*j-1)/2 + (2*j-1)){
//                                    System.out.print("*");
//                              }
//                              else{
//                                    System.out.print(" ");
//                              }
//                        }
//                      else{
//                              if(i < (2*totalLevel-1)-(2*j-1)/2 +1){
//                                    System.out.print(" ");
//                              }
//                              else{
//                                    System.out.print("*");
//                              }
//                        }
//                  }
//                  System.out.println();
//            }
//          double total = 100000;
//          int sum = 0;
//          while(total >= 1000){
//              if(total > 50000 ){
//                  total = total - total * 0.05;
//                  sum++;
//              }
//              else if(total <= 50000){
//                  total = total - 1000;
//                  sum++;
//              }
//          }
//
//          System.out.println(sum);
//          double sum = 0 ;
//          for(double i = 1; i <= 100; i++){
//              if(i % 2 ==0){
//                  sum = sum - 1 / i;
//              }else {
//                  sum = sum + 1 / i;
//              }
//
//
//          }
//          System.out.println(sum);
//          int sum = 0;
//          for(int i = 1; i <= 100; i++){
//              sum = sum + i*(101 - i);
//              System.out.println(sum);
//          }
//          System.out.println(sum);
//            double[] hens = {1, 2, 3, 4, 5};
//            System.out.println(hens[1]);
//            System.out.println(hens.length);
//                double[] scores = new double[5];
//                Scanner myScanner = new Scanner(System.in);
//                for( int i = 0; i < scores.length; i++){
//                    scores[i] = myScanner.nextDouble();
//                }
//                System.out.println(scores[2]);
//                int[] a;
//                a = new int[10];
//                    char[] a = new char[26];
//                    for(int i = 0; i < 26; i++){
//                        a[i] = (char)('A' + i);
//                        System.out.print(a[i]);
//                    }
//          int[] a = {4, -1, 9, 10, 23};
//          int max_value = a[0];
//          int max_index = 0;
//          for( int i = 1; i < a.length; i++ ){
//              if(a[i] > max_value){
//                  max_value = a[i];
//                  max_index = i;
//              }
//          }
//          System.out.println("该数组最大值的下标为" + max_index);
//          System.out.println("该数组最大值为" + max_value);

//          char a = 16;
//          int i = 1;
          //为什么可以char b = ‘A’ + 1，而不可以char b = ‘A’ + i呢，是因为
          //对于定义一个字符变量，赋值b变量‘A’等价于赋值b变量‘A’的ascii值。且可以直接char a = 100；
//
//          char b = 'A' + 1;
//          System.out.println(b);
//
//            int[] arr1 = {1, 2, 3};
//            int[] arr2 = new int[100];
//            arr2[0] = 1;
//            arr2[1] = 2;
//            arr2[2] = 3;
          //为数组末尾插入数字
//          Scanner sc = new Scanner(System.in);
//          int[] arr = {1, 2, 3};
//          do {
//              int[] arrNew = new int[arr.length + 1];
//              for(int i = 0; i < arr.length; i++) {
//                  arrNew[i] = arr[i];
//              }
//              System.out.println("请输入想要添加的数字：");
//              int addNum = sc.nextInt();
//              arrNew[arr.length] = addNum;
//              //可以释放掉内存空间
//              arr = arrNew;
//              System.out.println("是否需要继续添加，输入y/n");
//              char key = sc.next().charAt(0);
//              if (key == 'n' || key == 'N') {
//                  break;
//              }
//          }while(true);
//          System.out.println("更新后的数组为：");
//          for (int i = 0; i < arr.length; i++) {
//              System.out.print(arr[i] + " ");
//          }

//            int[][] arr = {{0, 1, 2, 3, 4, 5},
//                          {1, 2, 3, 4, 5, 6},
//                          {2, 3, 4, 5, 6, 7, 8},
//                           {3, 4, 5, 6, 7, 8, 9}};
//            for(int i  = 0; i < arr.length; i++){
//                  for(int j = 0; j < arr[i].length; j++){
//                        System.out.print(arr[i][j] + " ");
//                  }
//                  System.out.println();
//            }
            //杨辉三角
//            int arr[][] = new int [10][];
//            for(int i  = 0; i < arr.length; i++){
//                  arr[i] = new int[i + 1];
//                 for(int j = 0; j < arr[i].length; j++){
//                       if(j == 0){
//                             arr[i][j] = 1;
//                       }
//                       else if(i != j){
//                             arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
//                       }
//                       else{
//                             arr[i][j] = 1;
//                       }
//                 }
//            }
//            for(int i  = 0; i < arr.length; i++) {
//                  for (int j = 0; j < arr[i].length; j++) {
//                        System.out.print(arr[i][j] + "\t");
//                  }
//                  System.out.println();
//            }
            //二维数组的另外一种定义方式。
            int[] arr[] = new int[2][2];

      }
}




