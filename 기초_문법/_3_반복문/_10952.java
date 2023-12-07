package 기초_문법._3_반복문;

import java.io.*;
import java.util.ArrayList;

public class _10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();


        while(true){
            String input = reader.readLine();
            String[] val = input.split(" ");
            int num1 = Integer.parseInt(val[0]);
            int num2 = Integer.parseInt(val[1]);

            if (num1 == 0 && num2 ==0){
                break;
            }
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
