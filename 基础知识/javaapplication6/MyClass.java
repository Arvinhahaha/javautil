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
abstract 与final矛盾
*/
public final class MyClass {
    final int num = 100;
    public final void  method(){
        System.out.println("方法调用");
    }
}
