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
public class Computer {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    
    public void powerOff(){
        System.out.println("电脑关机");
    }
    
    public void useDevice(USB usb){
        
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }
        else if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.type();
           } 
        
        usb.close();
      
    }
}
