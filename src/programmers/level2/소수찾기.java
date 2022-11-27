package programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(solution("011"));
    }

    static int count;
    static Set<Integer> set = new HashSet<>();

    public static int solution(String numbers) {
        for(int i = 1; i <= numbers.length(); i++) {
            permutation(0, i, numbers.split(""), new boolean[numbers.length()], "");
        }
        return count;
    }

    public static void permutation(int startDept, int targetDepth, String[] arr, boolean[] check, String result) {
        if (startDept == targetDepth) {
            isPrime(result);
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (!check[i]) {
                    check[i] = true;
                    permutation(startDept + 1, targetDepth, arr, check, result + arr[i]);
                    check[i] = false;
                }
            }
        }
    }

    public static void isPrime(String str) {
        int num = Integer.parseInt(str);

        boolean isPrime = true;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime && num > 1 && !set.contains(num)) {
            set.add(num);
            count++;
        }
    }
}
