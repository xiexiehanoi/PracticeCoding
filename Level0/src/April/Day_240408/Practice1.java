package April.Day_240408;

public class Practice1 {
    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4)?true: false;
    }

    public static void main(String[] args) {
        boolean x1 = true;
        boolean x2 = false;
        boolean x3 = false;
        boolean x4 = false;
        boolean result = solution(x1,x2,x3,x4);
        System.out.println("result: "+result);
    }
}
