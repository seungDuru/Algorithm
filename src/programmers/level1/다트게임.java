package programmers.level1;

import java.util.stream.IntStream;

public class 다트게임 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "1S2D*3T";
        System.out.println(solution(s));
    }

    public static int solution(String dartResult) {
        String temp = "";
        int score[] = new int[3];
        int index = 0;

        for(int i = 0;i<dartResult.length();i++){
            switch(dartResult.charAt(i)){
                case '*':
                    score[index-1]*=2;
                    if(index >1) score[index-2]*=2;
                    break;
                case '#':
                    score[index-1]*=-1;
                    break;
                case 'S':
                    score[index] = (int)Math.pow(Integer.parseInt(temp),1);
                    index++;
                    temp ="";
                    break;
                case 'D':
                    score[index] = (int)Math.pow(Integer.parseInt(temp),2);
                    index++;
                    temp ="";
                    break;
                case 'T':
                    score[index] = (int)Math.pow(Integer.parseInt(temp),3);
                    index++;
                    temp ="";
                    break;
                default:
                    temp+=String.valueOf(dartResult.charAt(i));
                    break;
            }
        }
        return IntStream.of(score).sum();
    }
}
