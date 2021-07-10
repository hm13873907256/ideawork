package cn.com.demo;

import cn.com.realize.test_1;

import java.util.Scanner;

/**
 * 算法测试主函数
 *
 *
 * */
public class test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(test_1.gcd(Integer.parseInt(sc.next()),Integer.parseInt(sc.next())) );
    }
}
