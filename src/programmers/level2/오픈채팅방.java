package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 오픈채팅방 {

    private static final String ENTER = "���� ���Խ��ϴ�.";
    private static final String LEAVE = "���� �������ϴ�.";

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        for(String s : solution(record)) System.out.println(s);
    }

    public static String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();

        for(String s : record) {
            String[] event = s.split(" ");
            if("Enter".equals(event[0]) || "Change".equals(event[0]))
                map.put(event[1], event[2]);
        }

        List<String> list = new ArrayList<>();
        for(int i = 0; i < record.length; i++) {
            String[] event = record[i].split(" ");

            String action = event[0];
            if("Change".equals(action)) continue;

            String nickName = map.get(event[1]);
            String sentence = "";
            if("Enter".equals(action)) sentence = nickName + ENTER;
            if("Leave".equals(action)) sentence = nickName + LEAVE;
            list.add(sentence);
        }

        return list.toArray(new String[list.size()]);
    }
}
