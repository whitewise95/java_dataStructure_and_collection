package studyAlgorithm.level_1;

import java.util.*;
import java.util.stream.Collectors;


/*
* https://school.programmers.co.kr/learn/courses/30/lessons/12915
* 아직 못풀음 알고리즘 동영상 보면서 해결할 수 있을 때 다시해보기기
* */
public class 문자열_내_마음대로_정렬하기 {

    public static void main(String[] args) {
        printTest(solution(new String[] { "abce", "cdx", "abcd", "abca"}, 2));
    }

    private static void printTest(String[] solution) {
        for (String test : solution) {
            System.out.println(test + ", ");
        }
    }

    public static String[] solution(String[] strings, int n) {

        for (int i = 0; i < strings.length - 1; i++) {
            int j = i;
            int cnt = 0;
            while (strings[j].split("")[n].compareTo(strings[j + 1].split("")[n]) > 0) {
                String temp = strings[j];
                strings[j] = strings[j + 1];
                strings[j + 1] = temp;
                if (j > 0) {
                    j--;
                    cnt ++;
                }
            }
            if(cnt != 0){
                if (strings[j].split("")[n].compareTo(strings[j + 1].split("")[n]) == 0) {
                    List<String> test = Arrays.asList(strings[j], strings[j + 1]).stream()
                            .sorted()
                            .collect(Collectors.toList());

                    strings[j] = test.get(0);
                    strings[j + 1] = test.get(1);
                }
            }

        }
        return strings;
    }

    private static boolean isOverLapCheck(String s, String[] answer) {
        for (String str : answer) {
            if (s.equals(str)) {
                return true;
            }
        }
        return false;
    }

}
