package 기초_문법._3_반복문;

import java.util.Scanner;

public class _25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int val = input / 4;
        for (int i = 0; i < val; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
