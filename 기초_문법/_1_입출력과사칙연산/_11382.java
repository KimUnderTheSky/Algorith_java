package 기초_문법._1_입출력과사칙연산;

import java.io.IOException;
import java.util.Scanner;
// 들어오는 값의 단위가 커서 long타입으로 바꿔야함
public class _11382 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();


        System.out.println(a + b + c);
    }
}
