package 기초_문법._3_반복문;
import java.util.Scanner;
// 반복문 곱셈
public class _2739 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 입력받기
        String input = sc.next();
        int num = Integer.parseInt(input);

        for(int i = 1;i < 10;i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        sc.close();
    }
}
