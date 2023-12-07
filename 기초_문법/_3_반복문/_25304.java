package 기초_문법._3_반복문;

import java.util.Scanner;

public class _25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long total_amount = sc.nextLong();
        int total_count = sc.nextInt();
        long check_total_amount = 0; // 총 금액을 담을 변수

        for (int i = 0; i < total_count; i++){
            long price = sc.nextLong();
            long quantity = sc.nextLong();

            check_total_amount += price * quantity; // 각 물건의 가격과 개수를 곱하여 총 금액에 더함
        }

        if (total_amount == check_total_amount){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }



}
