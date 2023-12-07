package 기초_문법._3_반복문;

import java.io.*;
import java.util.ArrayList;

public class _15552 {
//본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();
        int count = Integer.parseInt(reader.readLine());

        for(int i = 0 ; i < count; i++){
            String[] input =reader.readLine().split(" ");

            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);

            arr.add(num1 + num2);
        }

        for(int value : arr){
            writer.write(value + "\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
