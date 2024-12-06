package com.example.demo.chap3.arayandlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArayAndList {
    public static void main(String[] args) {
        String[] array = {"gerbill", "tha"};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.set(1, "test"); // [gerbil, test]
        array[0] = "new";
        list.add("ấ");
        System.out.println(list);
    }
}
