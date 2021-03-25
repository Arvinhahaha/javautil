/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 杨军望
 */
public class DemoMain {

    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.eat();
        Manager manager = new Manager("群主", 100);
        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("***********群主开始发红包了哈哈哈哈哈*************");
        
        ArrayList<Integer> redList  = manager.send(new Random().nextInt(manager.getMoney()), 3);
        one.recesive(redList);
        two.recesive(redList);
        three.recesive(redList);
         manager.show();
        one.show();
        two.show();
        three.show();
    }

}
