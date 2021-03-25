/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author 杨军望
 */
public class phone {
    String band;
    int price;
    String color;
    
    public void phone(String name){
        System.out.println("给"+name+"打电话");
    }
    public void sendMseesage(){
        System.out.println("群发短信");
    }
}
