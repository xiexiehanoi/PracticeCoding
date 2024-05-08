package Mars.Day_240507;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            String s ="*";
            System.out.println(s.repeat(i));
        }
    }
}
