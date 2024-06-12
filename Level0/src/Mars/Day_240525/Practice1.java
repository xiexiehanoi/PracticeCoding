package Mars.Day_240525;

public class Practice1 {
    public int solution(int[][] dots) {
        int answer = 0;
        int xMax = dots[0][0];
        int xMin = dots[0][0];
        int yMax = dots[0][1];
        int yMin = dots[0][1];

        for(int i = 0; i < dots.length; i++) {
            xMax = Math.max(xMax, dots[i][0]);
            xMin = Math.min(xMin, dots[i][0]);
            yMax = Math.max(yMax, dots[i][1]);
            yMin = Math.min(yMin, dots[i][1]);
        }
        answer = (xMax-xMin)*(yMax-yMin);
        return answer;
    }

    public static void main(String[] args) {
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int result = new Practice1().solution(dots);
        System.out.println("result = " + result);
    }
}
