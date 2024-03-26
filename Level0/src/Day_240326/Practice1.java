package Day_240326;

//문자들이 담겨있는 배열 arr가 주어집니다. 
//arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

//arr	             result
//["a","b","c"]	     "abc"

//회고: 생각보다 실행시간이 너무 길게 나온다.
//		백엔드 개발자가 되기 위해서는 실행 시간은 진짜 많이 줄여야하는데
//		아직 갈길이 먼거 같다.

public class Practice1 {
	public static String solution(String[] arr) {

			
	 	long startTime = System.nanoTime(); // 시작 시간 기록
		String answer = "";
		//일단 arr을 하나씩 나오게 한 다음
		for(int i=0; i<arr.length; i++) {
			//answer에다가 하나씩 추가하기
			answer += arr[i];

        long endTime = System.nanoTime(); // 종료 시간 기록
        long duration = endTime - startTime; // 실행 시간 계산

        System.out.println("Time taken: " + duration + " nanoseconds");
	}
        return answer;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"a","b","c"};
		String result = solution(arr);
		System.out.println(result);	
		}
		
	}

