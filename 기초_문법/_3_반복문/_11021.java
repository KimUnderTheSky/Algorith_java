package 기초_문법._3_반복문;

import java.io.*;
import java.util.ArrayList;

public class _11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();

        int count = Integer.parseInt(reader.readLine());

        for(int i =0; i < count; i++){
            String input = reader.readLine();
            String[] val = input.split(" ");

            int num1 = Integer.parseInt(val[0]);
            int num2 = Integer.parseInt(val[1]);
            arr.add(num1 + num2);

        }

        for(int j = 0; j < count; j++){
            int idx = j + 1;
            writer.write("Case #" + idx + ": " + arr.get(j) + "\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
