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
public class Member extends User{

    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {
        super();
    }
    public void recesive(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
        int detlta = list.remove(index);
        int money = super.getMoney();
        money+=detlta;
        super.setMoney(money);
    }
}
