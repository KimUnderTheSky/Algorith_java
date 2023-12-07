package 기초_문법._3_반복문;

import java.util.ArrayList;
import java.util.Scanner;

public class _10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        // Scanner를 사용하여 nextInt 후, nextLine을 사용
        // 그러나 nextInt()는 정수만 입력받기 때문에 입력 버퍼에 엔터('\n')가 남게 됨
        // 그래서 sc.nextLine()이 엔터를 만나면 바로 종료되고 빈 문자열을 반환하게 된다.
        int loop = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < loop; i++){
            String input = sc.nextLine();
            String[] val = input.split(" ");
            int num1 = Integer.parseInt(val[0]);
            int num2 = Integer.parseInt(val[1]);

            arr.add(num1 + num2);
        }

        arr.forEach(System.out::println);
    }
}
