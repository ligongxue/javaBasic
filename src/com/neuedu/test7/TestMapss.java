package com.neuedu.test7;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class TestMapss{
    public static Map<Integer,String> map = new HashMap<Integer, String>();
    static {
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
    }
    public static void main(String[] args) {
        for (int i = 1; i <= map.size(); i++) {
            System.out.println(map.get(i));
        }
    }
}
