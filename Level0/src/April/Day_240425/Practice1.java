package April.Day_240425;

public class Practice1 {
    public static String solution(String phone_number) {
        StringBuilder answer = new StringBuilder(phone_number);
        for(int i=0; i<phone_number.length()-4;i++){
            answer.setCharAt(i, '*');
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String phone_number ="01033334444";
        String result = solution(phone_number);
        System.out.println("result: "+result);
    }
}
