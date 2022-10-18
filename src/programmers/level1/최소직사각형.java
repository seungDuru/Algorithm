package programmers.level1;

import java.util.Arrays;

public class 최소직사각형 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        int answer = 0;
        int[] arrWidth = new int[sizes.length];
        int[] arrHeight = new int[sizes.length];

        for(int i = 0; i < sizes.length; i ++) {
            int width = sizes[i][0];
            int height = sizes[i][1];
            if(width >= height) {
                arrWidth[i] = width;
                arrHeight[i] = height;
            } else {
                arrWidth[i] = height;
                arrHeight[i] = width;
            }
        }
        int widthMax = Arrays.stream(arrWidth).max().getAsInt();
        int heightMax = Arrays.stream(arrHeight).max().getAsInt();
        answer = widthMax*heightMax;
        return answer;
    }

    public static int solution2(int[][] sizes) {
        int max = 0,  min = 0;
        for (int[] size : sizes) {
            int paramMax = Math.max(size[0], size[1]);
            int paramMin = Math.min(size[0], size[1]);
            if (paramMax > max) max = paramMax;
            if (paramMin > min) min = paramMin;
        }
        return max * min;
    }
}
