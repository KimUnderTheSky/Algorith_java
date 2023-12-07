package 기초_문법._2_조건문;

import java.util.Scanner;

public class _2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] val = input.split(" ");

        int hour = Integer.parseInt(val[0]);
        int minute = Integer.parseInt(val[1]);

        int remain_minute = minute - 45;
        int remain_hour = hour;


        if (remain_minute < 0){
            remain_minute = 60 + remain_minute;
            remain_hour = remain_hour - 1;
            if (remain_hour < 0){
                remain_hour = 24 + remain_hour;
            }
        }

        System.out.print(remain_hour + " " + remain_minute);
    }
}
