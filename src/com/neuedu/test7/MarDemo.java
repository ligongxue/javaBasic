package com.neuedu.test7;

import java.io.*;

public class MarDemo {
    public static void main(String[] args) throws IOException {
        File file =new File("D:\\bbb");//想要复制的文件地址
        if (!file.exists()){//判断文件是否存在

            file.mkdir();//如果不存在自动创建

        }
        File[] files = file.listFiles();//拿到所有的子文件（列表文件）存放到数组中
        for (File f:files//循环遍历所有文件
        ) {
            if (f.isFile()) {//判断是否为文件
                FileReader fr  = new FileReader(f);//读取文件
                BufferedReader re = new BufferedReader(fr);//缓冲区
                File file1 = new File("D:\\aaa");//想要复制到的地址
                if (!file1.exists()){//判断文件是否存在
                    file1.mkdir();//没有则自动创建
                }
                FileWriter fe = new FileWriter("D:\\aaa\\"+f.getName());//往目标文件写入
                BufferedWriter wr = new BufferedWriter(fe);//缓冲区
                String i = null;
                while((i=re.readLine())!=null){//遍历读到的文件，循环不为空 就一直循环 为null停止循环
                    System.out.println(i);
                    wr.write(i);//将读到的内容写入文件
                }
                wr.flush();//刷新
                fr.close();//关闭资源
                fe.close();//关闭资源
            }
        }


    }
}
