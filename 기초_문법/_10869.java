package 기초_문법;
// 사칙연산
import java.util.Scanner;

public class _10869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // 입력받은 문자열을 공백기준으로 나눔
        String[] values = input.split(" ");

        System.out.println(Integer.parseInt(values[0]) + Integer.parseInt(values[1]));
        System.out.println(Integer.parseInt(values[0]) - Integer.parseInt(values[1]));
        System.out.println(Integer.parseInt(values[0]) * Integer.parseInt(values[1]));
        System.out.println(Integer.parseInt(values[0]) / Integer.parseInt(values[1]));
        System.out.println(Integer.parseInt(values[0]) % Integer.parseInt(values[1]));

        sc.close();
    }
}
