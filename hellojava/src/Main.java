package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nhap ho ten:");
        // intm long,
        // double, float


        System.out.println("UCLN: " + timUCLN(18,72));
    }

    public  static int timUCLN(int a, int b) {
        int max = 0;
        int min = 0;
        if (a < b) {
            min = a;
        }else{
            min = b;
        }
        for (int i = 1; i<= min; i++) {
            if (a % i == 0 && b % i ==0) {
                max = i;
            }
        }
        return max;
    }
}