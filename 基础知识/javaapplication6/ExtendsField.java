/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import com.sun.prism.impl.PrismSettings;

/**
 *
 * @author 杨军望
 */
//创建的对象是谁就用谁
/*
重写发生在继承中 参数一样 方法的覆盖
*/
public class ExtendsField {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
        zi.method();
    }
}
