package Day_240327;
/*
 * 문자열 my_string과 정수 k가 주어질 때,
   my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
 */


public class Practice1 {

	    public static String solution(String my_string, int k) {
	    	long startTime = System.nanoTime();
	    	String answer ="";
	    	//1. 문자를 반복해보자
	    	// 1-1 반복할 문자는 k번 나온다.
	    	// 1-2 answer에 계속 my_string이 추가 되게하자
	    	for(int i=0; i<k; i++) {
	    		answer += my_string;
	    	}
	    	long endTime = System.nanoTime(); // 종료 시간 기록
	        long duration = endTime - startTime; // 실행 시간 계산

	        System.out.println("Execution time: " + duration + " nanoseconds"); // 실행 시간 출력
	    	return answer;
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "Hello";
		int k =4;
		String str2 = solution(my_string, k);
		System.out.println(str2);
	}

}
