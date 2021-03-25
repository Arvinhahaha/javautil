/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author 杨军望
 * 不能用借楼实现类的对象来调用静态方法
 */
public class DemoImp {
    public static void main(String[] args) {
        MyInterfaceStaticImp  imp = new MyInterfaceStaticImp();
        MyInterfaceStatic.method();
    }
    
}
