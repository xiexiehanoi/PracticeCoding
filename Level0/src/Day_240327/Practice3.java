package Day_240327;

/*
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
	12 ⊕ 3 = 123
	3 ⊕ 12 = 312
	양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
	
	단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
 */

public class Practice3 {
	    public static int solution(int a, int b) {
	    	long startTime = System.nanoTime();
	        int answer = 0;
	        //1. 숫자a,b를 문자로 바꾸기
	        //2. 두 문자를 더 해서 다시 숫자로 바꾸기
	        //3. a+b와 b+a를 만들어 놓기
	        int num1 = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
	        int num2 = Integer.parseInt(Integer.toString(b)+Integer.toString(a));
	        //3. a+b가 숫자가 큰지 b+a가 큰지 확인
	        //4. 큰 수가 answer로 출력되게 하기
	        
	        long endTime = System.nanoTime(); // 종료 시간 기록
	        long duration = endTime - startTime; // 실행 시간 계산

	        System.out.println("Execution time: " + duration + " nanoseconds"); // 실행 시간 출력
	        return answer = num1 > num2? num1 : num2;
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b=123;
		int num = solution(a,b);
		System.out.println(num);
	}

}
