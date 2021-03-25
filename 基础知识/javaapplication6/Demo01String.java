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
public class Demo01String {
    public static void main(String[] args) {
        String str1="java";
        String str2="JAVA";
        String str4="abcdefghijklmnopqrstuvwxyz";
        String str3=str1.concat(str2);
        char [] ch1=new char[]{'1','2','3'};
        String str10 = ch1.toString();
        char ch = "Hello".charAt(1);
        int index = "Hello".indexOf("llo");
        String str5 = str4.substring(5);
        String str6 = str4.substring(5,24);
        String str7 =new String(ch1);
        System.out.println(str3);
        System.out.println(ch);
        System.out.println(index);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equalsIgnoreCase(str1));
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str6.toCharArray());
        System.out.println(str6.getBytes());
        String str8 = "How old are you";
        System.out.println(str8.replace('o', 'e'));
        String str9 = "aaa,bbb,ccc,ddd,eee";
        String [] array1 =str9.split(",");
        for(String s:array1){
            System.out.println(s);
        }
        Scanner sc = new Scanner(System.in);
        char c5=sc.next().charAt(0);
        System.out.println(str1.length());
    }
}
