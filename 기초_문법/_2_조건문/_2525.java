package 기초_문법._2_조건문;

import java.util.Scanner;

public class _2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int time = sc.nextInt();

        String[] val = input.split(" ");
        int hour = Integer.parseInt(val[0]);
        int minute = Integer.parseInt(val[1]);

        //    시 분 계산
        int sol_minute = (minute + time) % 60;
        int sol_hour = hour + ((minute + time) / 60);

        if(sol_hour >= 24){
            sol_hour = sol_hour % 24;
        }

        System.out.print(sol_hour + " " + sol_minute);
    }

}
