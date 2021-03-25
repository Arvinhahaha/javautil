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
public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<Person> arr = new ArrayList<>();
        Person p1 = new Person();
        p1.name="123";
        Person p2 = new Person();
        p2.name="456";
        arr.add(p2);
        arr.add(p1);
        System.out.println(arr.get(0).name);
    }
}
