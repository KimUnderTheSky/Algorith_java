package 기초_문법._3_반복문;

import java.util.Scanner;

public class _8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= val; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
