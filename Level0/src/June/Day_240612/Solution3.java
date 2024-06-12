package June.Day_240612;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution3 {
    static BigInteger K;
    static int L;

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        K = new BigInteger(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        // 에라토스테네스의 체를 사용하여 L보다 작은 모든 소수를 찾기
        List<Integer> primes = eratosthenes(L);

        // 초기화: 좋은 암호인지 확인하는 변수와 가장 작은 인수를 저장할 변수
        boolean isGood = true;
        int smallestDivisor = -1;

        // 소수 리스트를 순회하며 K가 소수로 나누어지는지 확인
        for (int prime : primes) {
            // 만약 K가 현재 소수로 나누어지면
            if (K.mod(BigInteger.valueOf(prime)).equals(BigInteger.ZERO)) {
                // 나쁜 암호로 판별하고 플래그를 false로 설정
                isGood = false;
                // 가장 작은 인수를 기록
                smallestDivisor = prime;
                // 더 이상 검사할 필요 없으므로 반복문 종료
                break;
            }
        }

        // 암호의 좋고 나쁨에 따라 결과 출력
        if (isGood) {
            bw.write("GOOD");
        } else {
            bw.write("BAD " + smallestDivisor);
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // 에라토스테네스의 체를 사용하여 소수를 찾는 메서드
    private static List<Integer> eratosthenes(int limit) {
        // 소수 여부를 저장할 배열 생성
        boolean[] isPrime = new boolean[limit];
        // 배열을 true로 초기화 (0과 1 제외)
        for (int i = 2; i < limit; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘 적용
        for (int i = 2; i * i < limit; i++) {
            // 현재 숫자가 소수인 경우
            if (isPrime[i]) {
                // 현재 소수의 배수를 모두 false로 설정
                for (int j = i * i; j < limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 소수 리스트를 저장할 객체 생성
        List<Integer> primes = new ArrayList<>();
        // 소수 배열을 순회하며 true인 인덱스를 소수 리스트에 추가
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
