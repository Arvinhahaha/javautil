/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 杨军望
 * 如果自定义的类需要有Comparable 或者Comparator 接口的支持
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int [] arrays={1,2,3,6,8,9,4,6,59,87,46,5,79,6,5,787,64,97,89};
        String intStr = Arrays.toString(arrays);
        System.out.println(intStr);
        Arrays.sort(arrays);
//        for(int num:arrays)
//        System.out.print(num+" ");
        System.out.println(Arrays.toString(arrays));
        
        String[] array2 = {"aaa","ccc","bbb"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        
        String s ;
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        char [] ch;
        ch = s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+" ");
        }
        double a=1.5;
        System.out.println(Math.ceil(a)+"\n"+Math.floor(a)+"\n"+Math.round(a));
        System.out.println(Math.PI);
    }
}
