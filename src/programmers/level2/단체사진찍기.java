package programmers.level2;

public class 단체사진찍기 {

    public static void main(String[] args) {
        int n = 2;
        String[] data = {"N~F=0", "R~T>2"};

        System.out.println(solution(n, data));
    }

    private static String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};
    private static int answer = 0;

    public static int solution(int n, String[] data) {

        boolean[] visited = new boolean[8];
        perm("", visited, data);

        return answer;
    }

    public static void perm(String Sequence, boolean[] visited, String[] data) {
        if (Sequence.length() == 7) {
            if(isPass(Sequence, data)) {
                answer++;
            }
            return;
        }

        for (int i = 0; i < 8; i++) {
            if (!visited[i]) {
                visited[i] = true;
                String combi = Sequence + friends[i];
                perm(combi, visited, data);
                visited[i] = false;;
            }
        }
    }

    public static boolean isPass(String Sequence, String[] data) {
        for (String d : data) {
            int position1 = Sequence.indexOf(d.charAt(0));
            int position2 = Sequence.indexOf(d.charAt(2));
            char op = d.charAt(3);
            int index = d.charAt(4) -'0';
            if (op == '=') {
                if (!(Math.abs(position1 - position2) == index+1)) return false;
            } else if (op == '>') {
                if (!(Math.abs(position1 - position2) > index+1)) return false;
            } else if (op == '<') {
                if (!(Math.abs(position1 - position2) < index+1)) return false;
            }
        }
        return true;
    }
}
