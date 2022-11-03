package programmers.level2;

import java.util.Stack;

public class 괄호회전하기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "[](){}";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 0;
        String new_s = s;
        for(int i = 0; i < s.length(); i++){
            if(isCorrect(new_s)) answer++;
            new_s = new_s.substring(1, s.length()) + new_s.charAt(0);
        }
        return answer;
    }

    public static boolean isCorrect(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case '[':
                    stack.add('[');
                    break;
                case ']':
                    if(stack.isEmpty() || stack.peek() != '[') return false;
                    stack.pop();
                    break;
                case '{':
                    stack.add('{');
                    break;
                case '}':
                    if(stack.isEmpty() || stack.peek() != '{') return false;
                    stack.pop();
                    break;
                case '(':
                    stack.add('(');
                    break;
                case ')':
                    if(stack.isEmpty() || stack.peek() != '(') return false;
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
