package Mars.Day_240529;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        if(a==b && b==c && c==a){
            System.out.println(10000 + a * 1000);
        }else if(a==b && a!=c || a==c && b!=a){
            System.out.println(1000 + a * 100);
        }else if(b==c && b!=a){
            System.out.println(1000 + b * 100);
        }else{
            int max = a;
            if(max<b){
                max=b;
            }
            if(max<c){
                max=c;
            }
            System.out.println(max*100);
        }
    }
}
