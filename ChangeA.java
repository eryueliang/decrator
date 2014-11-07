package com.company;

import java.util.Scanner;

/**
 * Created by liangey on 14-11-7.
 */
public class ChangeA implements Ways {
    public void myWays() {
        System.out.println("输入大写字母哒");
        Scanner yoo = new Scanner(System.in);
        String b = yoo.nextLine();
        System.out.println("输出大写字母吧："+b.toLowerCase());
    }
}
