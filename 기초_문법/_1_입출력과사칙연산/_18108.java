package 기초_문법._1_입출력과사칙연산;

import java.util.Scanner;

public class _18108 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int dif = 2541 - 1998;
        int year = input - dif;

        System.out.println(year);
    }
}
