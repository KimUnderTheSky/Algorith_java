package 기초_문법._3_반복문;

import java.io.*;
import java.util.StringTokenizer;
// EOF: 입력에서 더 이상 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료

// 엔터만 입력하게 되면, 결국 빈 문자열("")이기 때문에 st객체에서는 반환 할 토큰이 존재하지 않게 됩니다.
//그래서 if조건절에서 토큰이 더이상 없는 상태로 false상태가 반환되고, 결국 else문에 의해 break가 되는 것이죠.
//EOF는 데이터가 없는 상태이고, 엔터, 스페이스 같은 모든 키보드 입력은 데이터가 존재합니다.
//다만, IDE나 콘솔 입력에서 EOF를 주고싶을 때 어떻게 할 수 있는 방법이 없기 때문에(즉, 입력이 끝인지, 단순 대기상태인지 알 수 없기 때문에) EOF 상태를 알리는 매크로같이 단축키를 만들게 되었는데, 윈도우의 경우는 ctrl + Z, 리눅스계열의 경우 ctrl + D가 이에 해당됩니다 :)
public class _10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 문자열

        // java에서 문자열을 구분자를 기준으로 분리할 때 사용되는 클래스입니다.
        StringTokenizer st; //
        String str; // 입력값

        while( (str = br.readLine()) != null ){
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");
        }
        System.out.print(sb);
    }
}