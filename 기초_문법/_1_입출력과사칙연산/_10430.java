package 기초_문법._1_입출력과사칙연산;
import java.util.Scanner;

public class _10430 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] val = input.split(" ");

        int num1 = Integer.parseInt(val[0]);
        int num2 = Integer.parseInt(val[1]);
        int num3 = Integer.parseInt(val[2]);

        System.out.println((num1+num2)%num3);
        System.out.println(((num1%num3)+(num2%num3))%num3);
        System.out.println((num1*num2)%num3);
        System.out.println(((num1%num3)*(num2%num3))%num3);


    }
}
