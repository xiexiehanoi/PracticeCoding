    package April.Day_240410;

    public class Practice1 {
        public static String solution(String my_string, int[][] queries) {
            StringBuilder answer = new StringBuilder(my_string);
            for(int i=0; i< queries.length; i++)
            {
                int num1 = queries[i][0];
                int num2 = queries[i][1];
                //범위의 문자만 따로 빼기
                String subString = answer.substring(num1, num2 + 1);
                //역순으로 변경
                StringBuilder reverse = new StringBuilder(subString).reverse();
                //교체 하기
                answer.replace(num1, num2 + 1, reverse.toString());
            }
            return answer.toString();
            }


        public static void main(String[] args) {
            String my_string = "rermgorpsam";
            int[][] queries = {{2,3}, {0, 7},{5,9},{6,10}};
            String result = solution(my_string, queries);
            System.out.println("result: "+result);
        }
    }
