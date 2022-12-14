package programmers.level2;

import java.util.Arrays;

public class 전화번호목록 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] arr = {"123","456","789"};

        System.out.println(solution(arr));
    }

    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i].startsWith(phone_book[i+1])) return false;
        }
        return true;
    }

}
