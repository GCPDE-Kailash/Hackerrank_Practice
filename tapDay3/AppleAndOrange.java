package tapDay3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount = 0;
        int orangeCount = 0;

        for (int i = 0; i < apples.size(); i++) {
            if (a + apples.get(i) >= s && a + apples.get(i) <= t) {
                appleCount++;
            }
        }
        for (int i = 0; i < oranges.size(); i++) {
            if (b + oranges.get(i) >= s && b + oranges.get(i) <= t) {
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int s = Integer.parseInt(firstMultipleInput[0]);

            int t = Integer.parseInt(firstMultipleInput[1]);

            String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int a = Integer.parseInt(secondMultipleInput[0]);

            int b = Integer.parseInt(secondMultipleInput[1]);

            String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int m = Integer.parseInt(thirdMultipleInput[0]);

            int n = Integer.parseInt(thirdMultipleInput[1]);

            List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            AppleAndOrange.countApplesAndOranges(s, t, a, b, apples, oranges);

            bufferedReader.close();
        }
    }
}

