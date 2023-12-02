package 기초_문법._2_조건문;
import java.util.Scanner;
// 대소비교
public class _1330 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 입력받기
        String input = sc.nextLine();
        // 공백을 기준으로 나누기
        String[] val = input.split(" ");

        // 문자열을 숫자로 변환
        int num1 = Integer.parseInt(val[0]);
        int num2 = Integer.parseInt(val[1]);

        // 비교
        if (num1 > num2) {
            System.out.println(">");
        } else if (num1 == num2) {
            System.out.println("==");
        } else {
            System.out.println("<");
        }
        sc.close();
    }
}
