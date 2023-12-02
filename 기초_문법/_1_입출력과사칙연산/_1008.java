package 기초_문법._1_입출력과사칙연산;

import java.util.Scanner;

public class _1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] val = input.split(" ");
        Double num1 = Double.parseDouble(val[0]);
        Double num2 = Double.parseDouble(val[1]);

        Double sol = num1 / num2;

        System.out.println(sol);
    }
}
