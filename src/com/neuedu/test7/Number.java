package com.neuedu.test7;
import java.util.ArrayList;
import java.util.Iterator;
public class Number {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        int[] arr = new int[10]; //标明长度
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = (int)(Math.random()*100+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=10)
                al.add(arr[i]);
        }
        Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
