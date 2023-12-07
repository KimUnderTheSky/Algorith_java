package 기초_문법._2_조건문;

import java.util.Scanner;

public class _14681 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        if(val1 > 0 && val2 > 0){
            System.out.println(1);
        }else if(val1 < 0 && val2 > 0){
            System.out.println(2);
        }else if(val1 < 0 && val2 < 0){
            System.out.println(3);
        }else{
            System.out.println(4);
        }
    }
}
