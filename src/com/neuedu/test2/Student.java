package com.neuedu.test2;
import java.util.Scanner;
public class Student {
    //有五个学生，每个学生有3门课的成绩，从键盘输入以上数据
    // （包括学生号，姓名，三门课成绩），计算出平均成绩
    String sno;
    String name;
    public void Run(){
        double avg =0;
        for(int i=0;i<5;i++){
            Scanner xs1 =new Scanner(System.in);
            System.out.print("请输入学生的学号:");
            String sno =xs1.next();

            Scanner xs2 =new Scanner(System.in);
            System.out.print("请输入学生的姓名:");
            String name =xs2.next();

            Scanner xs3 =new Scanner(System.in);
            System.out.println("请输入学生的成绩:");
            int [] arr=new int[3];
            for(int j = 0; j<3;j++){
                arr[j]=xs3.nextInt();//给数组for循环键盘录入值;
            }
            double sum=0;
            for (int j=0;j<arr.length ;j++){
                sum+=arr[j];
                avg=sum/3;
            }
            System.out.println(name+"的学号为：" +sno );
            System.out.println("三科的平均成绩为："+avg);
            System.out.println();
        }
    }


}
