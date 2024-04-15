    package April.Day_240410;

    import java.util.ArrayList;
    import java.util.List;

    public class Practice2 {
        public List<Integer> solution(String[] intStrs, int k, int s, int l) {
            List<Integer> answer = new ArrayList<>();
            for(String strs: intStrs){
                int subString = Integer.parseInt(strs.substring(s,s+l));
                if(subString>k){
                    answer.add(subString);
                }
            }
            return answer;
        }

        public static void main(String[] args) {
            String[] intStrs = {"0123456789","9876543210","9999999999999"};
            int k =50000;
            int s =5;
            int l =5;
            Practice2 practice2 = new Practice2();
            List<Integer> result = practice2.solution(intStrs,k,s,l);
            System.out.println("result: "+result);
        }
    }
