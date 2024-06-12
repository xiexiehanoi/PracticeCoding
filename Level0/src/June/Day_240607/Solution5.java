package June.Day_240607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long existingCableCount = Long.parseLong(br.readLine());
        long requiredCableCount = Long.parseLong(br.readLine());
        long[] cableLengths = new long[(int) existingCableCount];

        for (int i = 0; i < existingCableCount; i++) {
            cableLengths[i] = Integer.parseInt(br.readLine());;
        }


        long maxCableLength = Arrays.stream(cableLengths).max().orElseThrow();

        long minLength = 1;
        long maxLength = maxCableLength;

        while (minLength <= maxLength) {
            long midLength = (minLength + maxLength) / 2;
            long totalCables = 0;

            for (long length : cableLengths) {
                totalCables += length / midLength;
            }

            if (totalCables >= requiredCableCount) {
                minLength = midLength + 1;
            } else {
                maxLength = midLength - 1;
            }
        }

        System.out.println(maxLength);

        }
    }
