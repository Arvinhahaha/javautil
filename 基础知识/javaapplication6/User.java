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
public class User {

    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User() {

    }
    public void show(){
        System.out.println("              我叫"+this.name+"有"+this.money+"元钱");
    }

//    public abstract ArrayList<Integer> send(int totalMoney, int count);
//
//    public abstract void resive(ArrayList<Integer> list);
}
