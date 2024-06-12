package June.Day_240612;

import java.io.*;
import java.util.*;

public class Solution1 {
    static int[] cards;
    static int n;
    static int m;

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine()," ");
        n= Integer.parseInt(st.nextToken());
        m= Integer.parseInt(st.nextToken());

        cards = new int[n];

        //카드 5장 넣기
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<cards.length; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        //카드배열, 카드 장수, 합 넣어주기
        int result = searchCards(cards, n, m);
        bw.write(result+"");

        bw.flush();
        bw.close();
        br.close();
    }

    static int searchCards(int[] cards, int n, int m){
        //3카드의 합
        int result = Integer.MIN_VALUE;

        //각 3가지 카드 찾기
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    //3카드의 합
                    int sum = cards[i] + cards [j] +cards[k];

                    //3카드의 합이 m과 같다면
                    if(m==sum){
                        result = sum;
                    } else if(result<sum && sum<m){ // 3카드의 합이 result 보다 크면서 m보다 작은 경우
                        result = sum;
                    }

                }
            }
        }
        return result;
    }

}
