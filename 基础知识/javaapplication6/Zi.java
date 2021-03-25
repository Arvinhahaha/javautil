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
/*
局部变量

*/
public class Zi extends Fu{
    int num = 10;
    @Override
    public  void method(){
        int num=5;
        System.out.println("局部变量"+num);
        System.out.println("成员变量"+this.num);
        System.out.println("父类成员变量"+super.num);
        System.out.println("子类方法执行了");
    }
}
