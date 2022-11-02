package programmers.level2;

import java.util.Stack;

public class 괄호변환 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    static int pos;

    public String solution(String p) {
        if(p.isEmpty()) return p;

        boolean correct = isCorrect(p);
        String u = p.substring(0, pos);
        String v = p.substring(pos, p.length());

        if(correct) {
            return u + solution(v);
        }

        String answer = "(" + solution(v) + ")";
        for(int i = 1; i < u.length()-1; i++) {
            if(u.charAt(i) == '(')
                answer += ")";
            else
                answer += "(";
        }

        return answer;
    }

    public static boolean isCorrect(String str) {
        boolean ret = true;

        int left = 0, right = 0;
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                left++;
                stack.push('(');
            } else {
                right++;
                if(stack.empty())
                    ret = false;
                else
                    stack.pop();
            }

            if(left == right) {
                pos = i + 1;
                return ret;
            }
        }
        return true;
    }
}
