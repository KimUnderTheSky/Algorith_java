package 기초_문법._5_문자열;
//문자열, 문자
import java.util.Scanner;

public class _27866 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 문자열 입력받기
        String input = sc.nextLine();
        // 순서 idx
        String num = sc.next();
        int idx = Integer.parseInt(num) - 1;

        char result = input.charAt(idx);
        System.out.println(result);


        sc.close();
    }
}
