package programmers.level1;

import java.util.Arrays;

public class 키패드누르기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] right = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};

        System.out.println(solution2(right, "right"));
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";

        Integer[] left   = {1, 4, 7};
        Integer[] right  = {3, 6, 9};
        StringBuilder sb = new StringBuilder();
        int nowL = 10;
        int nowR = 12;

        for(int a : numbers){
            if(Arrays.asList(left).contains(a)) {
                sb.append("L");
                nowL = a;
            } else if(Arrays.asList(right).contains(a)){
                sb.append("R");
                nowR = a;
            } else {
                int ld = calcDistance(a, nowL),  rd = calcDistance(a, nowR);

                if(ld > rd) {
                    sb.append("R");
                    nowR = a;
                } else if(ld < rd) {
                    sb.append("L");
                    nowL = a;
                } else {
                    if("R".equals(hand.substring(0, 1).toUpperCase())){
                        sb.append("R");
                        nowR = a;
                    } else {
                        sb.append("L");
                        nowL = a;
                    }
                }
            }
        }

        answer = String.valueOf(sb);

        return answer;
    }

    public static int calcDistance(int nowNumber, int location) {

        if(nowNumber == 0) nowNumber = 11;
        if(location == 0) location = 11;

        int locationX = (location - 1)/3;
        int locationY = (location - 1)%3;

        int nowNumberX = (nowNumber - 1)/3;
        int nowNumberY = (nowNumber - 1)%3;

        int result = Math.abs(locationX - nowNumberX) + Math.abs(locationY - nowNumberY);

        return result;
    }

    public static String solution2(int[] numbers, String hand) {
        String answer = "";

        Integer[] left = {1, 4, 7};
        Integer[] right = {3, 6, 9};
        Integer[] middle = {2, 5, 8, 0};
        StringBuilder sb = new StringBuilder();
        int nowL = 3;
        int nowR = 3;
        boolean checkL = false;
        boolean checkR = false;

        for(int a : numbers){
            if(Arrays.asList(left).contains(a)) {
                sb.append("L");
                nowL = Arrays.asList(left).indexOf(a);
                checkL = false;
            } else if(Arrays.asList(right).contains(a)){
                sb.append("R");
                nowR = Arrays.asList(right).indexOf(a);
                checkR = false;
            } else {
                int target = Arrays.asList(middle).indexOf(a);
                int ld = checkL ? Math.abs(target - nowL) -1 : Math.abs(target - nowL);
                int rd = checkR ? Math.abs(target - nowR) -1 : Math.abs(target - nowR);

                if(ld > rd) {
                    sb.append("R");
                    nowR = target;
                    checkR = true;
                } else if(ld < rd) {
                    sb.append("L");
                    nowL = target;
                    checkL = true;
                } else {
                    if("R".equals(hand.substring(0, 1).toUpperCase())){
                        sb.append("R");
                        nowR = target;
                        checkR = true;
                    } else {
                        sb.append("L");
                        nowL = target;
                        checkL = true;
                    }
                }
            }
        }

        answer = String.valueOf(sb);

        return answer;
    }
}
