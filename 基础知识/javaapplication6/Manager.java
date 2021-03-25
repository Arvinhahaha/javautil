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
public class Manager extends User {

    public Manager() {
        super();

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    /**
     *
     * @param totalMoney
     * @param count
     * @return
     */
    public ArrayList<Integer> send(int totalMoney, int count) {
        
        ArrayList<Integer> redList = new ArrayList<>();
        Random rd = new Random();
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;
        }

        super.setMoney(leftMoney - totalMoney);
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        redList.add(mod + avg);
        return redList;
    }
}
