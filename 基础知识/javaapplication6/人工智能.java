/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author 杨军望
 */
public class 人工智能 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in ,"iso-8859-1");
        while(true){
        String s = sc.next();
        int len = s.length();
        char ch = s.charAt(len-1);
        if(ch == '吗'){
            s = s.substring(0, len-1);
             System.out.println(s);
        }
        else {
            s+="嗯嗯";
             System.out.println(s);
        }
           
    }
    }
}
