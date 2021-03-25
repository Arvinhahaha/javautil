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
public class InterfaceDemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        
        computer.powerOn();
        
        //准备一个鼠标
        
        Mouse mouse = new  Mouse();
        
        USB usb = mouse;
        //参数就是usb类型
        
        //传递实现类
        computer.useDevice(mouse);
        
        //创建一个usb键盘
        
        USB usb1 = new KeyBoard();
        
        computer.useDevice(usb1);
        
        computer.useDevice(new KeyBoard());
        computer.powerOff();
    }
}
