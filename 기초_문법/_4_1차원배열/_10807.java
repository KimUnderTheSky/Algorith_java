package 기초_문법._4_1차원배열;

import java.io.*;
import java.util.StringTokenizer;

public class _10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        int count = 0;
        int[] arr = new int[N]; // 배열 선언
        // StringTokenizer로 한줄 입력받음
        StringTokenizer st = new StringTokenizer(reader.readLine());

        for(int i = 0 ; i < N ;i++){
            // 각 토큰별로 배열 값에 저장
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(reader.readLine());

        for(int j = 0; j < N; j++){
            if(arr[j] == v){
                count++;
            }
        }
        System.out.println(count);

        writer.flush();
        writer.close();
        reader.close();
    }
}
