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
接口四级多个类的公共接口
1.抽象方法 固定的操作 public abstact
*/
public interface DemoInterface {

    /**
     *
     */
    public abstract void methodAbs();
    abstract void methodAbs1();
    public  void methodAbs3();
    void methodAbs2();
    public default void methodfault(){};
}
