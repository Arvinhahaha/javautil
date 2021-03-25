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
public class Person {
    
    //访问成员变量用this关键字
    //访问成员变量
    String name;
    
    public void sayHello(String name){
        System.out.println(this.name+"你好我是"+name);
        System.out.println(this);
    }
}
