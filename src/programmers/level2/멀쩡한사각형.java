package programmers.level2;

import java.math.BigInteger;

public class 멀쩡한사각형 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public long solution(int w, int h) {
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        return ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);
    }
}
