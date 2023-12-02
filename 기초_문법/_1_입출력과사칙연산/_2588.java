package 기초_문법._1_입출력과사칙연산;

import java.util.Scanner;

public class _2588 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        int val1 = input1 * (input2 % 10);
        int val2 = input1 * ((input2 / 10) % 10);
        int val3 = input1 * (input2 / 100);
        int val4 = val1 + (val2 * 10) + (val3*100);

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
    }




}
