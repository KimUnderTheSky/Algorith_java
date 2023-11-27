package 기초_문법;
import java.util.Scanner;
import java.util.ArrayList;
// 최댓값
public class _2562 {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>(); // 배열
        String num; // 입력받을 하나의 값
        Scanner sc = new Scanner(System.in);
        int max_idx = 0;

        // 입력받기
        for(int i = 0; i < 9; i++){
            num = sc.next();
            numbers.add(Integer.parseInt(num));
        }

        //비교
        for(int i = 0; i < 9; i++){
            if(numbers.get(i) > numbers.get(max_idx)){
                max_idx = i;
            }
        }

        System.out.println(numbers.get(max_idx));
        System.out.println(max_idx + 1);

        sc.close();
    }
}
