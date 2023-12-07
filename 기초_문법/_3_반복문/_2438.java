package 기초_문법._3_반복문;

import java.io.*;

public class _2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(reader.readLine());
        StringBuilder star = new StringBuilder();

        for(int i = 0; i < count ; i++){
            star.append("*");
            writer.write(star + "\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
