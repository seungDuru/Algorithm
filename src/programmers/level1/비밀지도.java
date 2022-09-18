package programmers.level1;

public class 비밀지도 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        for(String str : solution(n, arr1, arr2)) {
            System.out.println(str);
        }
        //solution(n, arr1, arr2);
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String bin = String.format("%"+n+"s", Integer.parseInt(Integer.toBinaryString(arr1[i] | arr2[i])));
            answer[i] = bin.replaceAll("1", "#").replaceAll("0", " ");
        }
        return answer;
    }

    public static String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String str=Integer.toBinaryString(arr1[i] | arr2[i]);
            str = String.format("%"+n+"s",str);
            str = str.replaceAll("1" , "#");
            str = str.replaceAll("0" , " ");
            answer[i] = str;
        }
        return answer;
    }
}
