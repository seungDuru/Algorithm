package programmers.level2;

public class 이진변환반복하기 {

    public static void main(String[] args) {

        String s = "01110";

        for(int a : solution(s)){
            System.out.println(a);
        }
    }
    static int removeCnt;

    public static int[] solution(String s) {
        int redoCnt = 0;
        while(!s.equals("1")){

            s = binaryTransfer(s);
            redoCnt++;
        }

        int[] answer = {redoCnt, removeCnt};
        return answer;
    }

    public static String binaryTransfer(String str){
        String postStr = str.replaceAll("0", "");

        removeCnt += str.length() - postStr.length();

        String binaryStr = Integer.toBinaryString(postStr.length());

        return binaryStr;
    }


}
