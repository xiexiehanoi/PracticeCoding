package April.Day_240413;

public class Practice1 {
    static boolean solution(String s) {
        StringBuilder string = new StringBuilder(s.toUpperCase());
        int i = 0;
        int cntp= 0;
        int cnty = 0;
        while(i<string.length())
        {
            if(string.charAt(i)=='P'){
                cntp++;
                i++;
            }else if(string.charAt(i)=='Y'){
                cnty++;
                i++;
            }else{
                i++;
            }
        }
        if(cntp!=cnty){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        String s = "pPoooyY";
        boolean result = solution(s);
        System.out.println("result: "+result);
    }
}
