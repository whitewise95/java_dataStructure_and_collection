package studyAlgorithm.level_1;

import java.util.*;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915
 * 아직 못풀음 알고리즘 동영상 보면서 해결할 수 있을 때 다시해보기기
 * */
public class 문자열_내_마음대로_정렬하기 {

    public static void main(String[] args) {
        printTest(test2(new String[] { "abcaef", "abcdea", "cdx", "abcaee", "abcced", "abccec" }, 2));
        //        printTest(test(new String[] { "sun", "bed", "car" }, 1));
    }

    private static void printTest(String[] solution) {
        for (String test : solution) {
            System.out.println(test + ", ");
        }
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.split("")[n].compareTo(s2.split("")[n]) > 0)
                    return 1;
                else if (s1.split("")[n].compareTo(s2.split("")[n]) == 0)
                    return s1.compareTo(s2);
                else if (s1.split("")[n].compareTo(s2.split("")[n]) < 0)
                    return -1;
                else
                    return 0;
            }
        });
        return strings;
    }

    private static String[] test2(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            if (o1.split("")[n].compareTo(o2.split("")[n]) > 0)
                return 1;
            else if (o1.split("")[n].compareTo(o2.split("")[n]) == 0)
                return o1.compareTo(o2);
            else if (o1.split("")[n].compareTo(o2.split("")[n]) < 0)
                return -1;
            else
                return 0;
        });
        return strings;
    }


    private static String[] test(String[] strings, int n) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].charAt(n) > strings[j].charAt(n)) {
                    sort(strings, i, j);
                }
            }
        }

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].charAt(n) == strings[j].charAt(n)) {
                    if (strings[i].compareTo(strings[j]) > 0) {
                        sort(strings, i, j);
                    }
                }
            }
        }
        return strings;
    }

    private static void sort(String[] strings, int i, int j) {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(strings[i]);
        strings[i] = strings[j];
        strings[j] = stringBuffer.toString();
    }
}
