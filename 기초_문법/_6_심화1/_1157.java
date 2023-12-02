package 기초_문법._6_심화1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.Collections;

public class _1157 {
    public static void main(String[] args){
        HashMap<String, Integer> hashMap = new HashMap<>();

        int count = 0;

        Scanner sc = new Scanner(System.in);
        // 입력받기
        String input = sc.nextLine();
        String upperInput = input.toUpperCase(Locale.ROOT);

        // 단어 빈도 사전 만들기
        for(int i = 0; i < upperInput.length(); i++){
            // 해시맵
            if(hashMap.containsKey(upperInput.charAt(i))){
                // 기존에 존재하면 hashMap의 value에 +1
                hashMap.put(String.valueOf(upperInput.charAt(i)), hashMap.get(upperInput.charAt(i)));
            }else{
                // 없으면 새로 할당
                hashMap.put(String.valueOf(upperInput.charAt(i)), 1);
            }
        }

        // 최대 빈도 key 출력, 두개이상이면 ? 출력
         Integer maxValue = Collections.max(hashMap.values());

        for(Integer value : hashMap.values()){
            if(value == maxValue){
                count += 1;
            }
        }

        if(count > 1){
            System.out.println("?");
        }else{
            System.out.println(hashMap);
        }



        sc.close();
    }
}
