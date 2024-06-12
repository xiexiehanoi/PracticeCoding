package June.Day_240606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine(); // 단어를 입력 받음

            map.put(s, true); // 입력 받은 단어를 HashMap에 추가

            StringBuilder sb = new StringBuilder(s);
            String reverse = sb.reverse().toString(); // 입력 받은 단어를 뒤집어서 새로운 문자열 만듬

            if (map.containsKey(reverse)) { // 뒤집은 문자열이 HashMap에 있는지 확인하여 비밀번호인지 검사
                System.out.println(reverse.length() + " " + reverse.charAt(reverse.length() / 2));
                // 비밀번호의 길이와 가운데 글자를 출력
                break; // 비밀번호를 찾았으므로 반복문을 종료
            }
        }
    }
}
