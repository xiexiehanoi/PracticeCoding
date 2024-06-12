package Mars.Day_240531;

import java.io.*;

public class Solution4 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        //출력 값
        bw.write(fib(n)+" "+(n-2));

        bw.close();
        br.close();
        }

        //피보나치 재귀함수
        static int fib(int n){
            if (n == 1 || n == 2){
                return 1;
            }
            return fib(n-1)+fib(n-2);
        }
    }
