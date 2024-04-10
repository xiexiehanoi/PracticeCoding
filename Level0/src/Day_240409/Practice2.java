package Day_240409;

import java.math.BigInteger;

public class Practice2 {
    public static BigInteger solution(String number) {
        BigInteger num = new BigInteger(number);

        return num.remainder(new BigInteger("9"));
        }

    public static void main(String[] args) {
        String number = "78720646226947352489";
        BigInteger result = solution(number);
        System.out.println("result: "+result);
        }
    }
