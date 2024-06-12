package June.Day_240605;

import java.io.*;
/*
1. n개의 막대 입력
2. n개의 막대를 담을 배열생성
3. for문: n개의 배열의 길이만큼
4. 막대의 길이를 입력
5. count를 1로주기 (이미 한개입력되었으니) 이건 오른쪽서 보이는 개수
6. 현재 제일큰 길이를 max로 넣어두기(오른쪽에서 보니깐 배열의 맨 마지막이 max로)
7. 다시 for문을 하나 더 만든다(오른쪽에서부터 비교이기에 n-2)
8. 뒤에서부터 확인해서 max보다 작으면 continue, 크면 +1
 */
public class Solution5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 1;
        int max = arr[n - 1];
        for(int i=n-2; i>=1; i--){
            if(max<arr[i]){
                max=arr[i];
                count++;
            }
        }

        bw.write(count+"");
        bw.close();
        br.close();
    }
}
