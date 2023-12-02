package 기초_문법._6_심화1;

import java.util.Scanner;
import java.util.ArrayList;

//별찍기
public class _2444 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>(); // 별들


        // 입력받기
        String input = sc.nextLine();
        int num = Integer.parseInt(input);

        for (int i = 0; i < num; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < num - 1 - i; j++) {
                line.append(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                line.append("*");
            }
//            for (int j = 0; j < num - 1 - i; j++) {
//                line.append(" ");
//            }
            arr.add(line.toString());
        }

        for(int i = num-2; i >= 0; i--){
            arr.add(arr.get(i));
        }

        for (String s : arr) {
            System.out.println(s);
        }


        sc.close();
    }
}
