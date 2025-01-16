package com.example.demo.chap3.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class man {
    /** Map
     * Sử dụng map khi muốn gán giá trị với key.
     * Có thể chứa giá trị trùng lặp (for values)
     */
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("name","thanh"); // add mới dữ liệu trong map
        map.put("age","13");
        map.put("age","13");
        String a=map.get("name"); // get giá trị trong map
//        map.clear(); // xóa hết các giá trị trong map
        for(String key:map.values()){
            System.out.println(key);
        }

        /** Tree map
         * Khi khai báo lớp TreeMap , sẽ sắp xếp theo thứ tự
         *
         */
        Map<String,String> map1=new TreeMap<>();
        map1.put("bge","b");
        map1.put("ame","a");
        map1.put("ame","c");
        for(String f:map1.values()){
            System.out.println(f);
        }
    }
}
