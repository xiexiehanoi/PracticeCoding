package Mars.Day_240525;

public class Practice2 {
    public String solution(String[] id_pw, String[][] db) {
        for (String[] d : db) {
            if (id_pw[0].equals(d[0])) {
                if (id_pw[1].equals(d[1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }

    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
        String result = new Practice2().solution(id_pw, db);
        System.out.println("result = " + result);
    }
}
