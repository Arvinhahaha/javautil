/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.ArrayList;

/**
 *
 * @author 杨军望
 */
public class DemoArrayList {

    public static void main(String[] args) {
        //包装类
        ArrayList arr = new ArrayList<Integer>(10);
        arr.add(1);
        arr.add(2);
        arr.add(0, 1);
//        arr.add(3,7);

        System.out.println(arr);
        System.out.println("size=" + arr.size());
        arr.remove(2);
        System.out.println(arr);
        System.out.println("size=" + arr.size());
    }
}
