package Mars.Day_240529;

import java.util.Scanner;

class Solution{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        String str = "*";
        for(int i=1; i<=input; i++){
          System.out.println(str.repeat(i));
        }
    }
}
