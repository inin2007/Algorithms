package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = in.nextInt();
        int result = 0;
        while(num != 0){
            result = result * 10;
            result = result + num%10;
            num = num/10;
        }
        System.out.print(result);
    }
}
