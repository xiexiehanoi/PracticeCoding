package Mars.Day_240523;

import java.util.HashSet;

public class Practice1 {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;

        boolean isMatched = false;
        for (String s : dic) {
            HashSet<Character> setS = new HashSet<>();
            for (char c : s.toCharArray()) {
                setS.add(c);
            }
            boolean letter = true;
            for(int i = 0; i < spell.length; i++) {
                if (!setS.contains(spell[i].charAt(0))) {
                    letter = false;
                    break;
                }
            }
            if (letter) {
                isMatched = true;
                break;
            }

        }

        if (isMatched) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] spell ={"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        int result = new Practice1().solution(spell, dic);
        System.out.println("result = " + result);
    }
}
