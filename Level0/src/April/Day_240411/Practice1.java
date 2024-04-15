package April.Day_240411;

public class Practice1 {
    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        int i = 0;
        while(i<parts.length){
            int num1 = parts[i][0];
            int num2 = parts[i][1];
            String string = my_strings[i];
            String temp = string.substring(num1,num2+1);
            i++;
            answer.append(temp);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String[] my_string = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
        String result = solution(my_string, parts);
        System.out.println("result: "+result);
    }
}
