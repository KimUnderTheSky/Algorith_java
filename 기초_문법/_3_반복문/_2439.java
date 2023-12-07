package 기초_문법._3_반복문;

import java.io.*;
import java.util.ArrayList;

public class _2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(reader.readLine());
        for(int i=1; i<=count; i++){
            for(int j =1; j<=count-i; j++){
                writer.write(" ");
            }
            for(int k = 0; k < i; k++){
                writer.write("*");
            }
            writer.write("\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
