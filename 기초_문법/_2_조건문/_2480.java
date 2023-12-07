package 기초_문법._2_조건문;

import java.util.Scanner;

public class _2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] val = input.split(" ");
        int num1 = Integer.parseInt(val[0]);
        int num2 = Integer.parseInt(val[1]);
        int num3 = Integer.parseInt(val[2]);

        int dice_case;

        if((num1 == num2) && (num2 == num3) && (num1 == num3) ){
            dice_case = 1;
        }else if(num1 == num2){
            dice_case = 2;
        }
        else if(num2 == num3){
            dice_case = 3;
        }
        else if(num1 == num3){
            dice_case = 4;
        }else{
            dice_case = 5;
        }

        switch (dice_case){
            case 1:
                System.out.println(10000 + num1*1000);
                break;
            case 2:
                System.out.println(1000 + num1*100);
                break;
            case 3:
                System.out.println(1000 + num2*100);
                break;
            case 4:
                System.out.println(1000 + num3*100);
                break;
            case 5:
                int max = Math.max(Math.max(num1, num2), num3);
                System.out.println(100 * max);
                break;

        }
    }

}
