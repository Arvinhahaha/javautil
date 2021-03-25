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
public class DemoArrayListSelect {

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> BigList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < BigList.size(); i++) {
            if (BigList.get(i) % 2 == 0) {
                smallList.add(BigList.get(i));
            }
        }
        return smallList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i * 3);
        }
        arr2 = getSmallList(arr);
        System.out.println(arr + "\n" + arr2);
    }
}
