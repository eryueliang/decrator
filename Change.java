package com.company;


import java.util.Scanner;

/**
 * Created by liangey on 14-11-7.
 */
public class Change implements Ways {
    @Override
    public void myWays() {
        System.out.println("输入小写字母哒");
        Scanner yo = new Scanner(System.in);
        String a = yo.nextLine();
        System.out.println("换成大写:"+a.toUpperCase());
    }
}
