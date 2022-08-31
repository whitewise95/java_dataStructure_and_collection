package studyAlgorithm.level_1;

import java.util.*;
import java.util.stream.Collectors;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915
 * 아직 못풀음 알고리즘 동영상 보면서 해결할 수 있을 때 다시해보기기
 * */
public class 문자열_내_마음대로_정렬하기 {

    public static void main(String[] args) {
        printTest(solution(new String[] { "abcaef", "abcdea", "cdx", "abcaee", "abcced", "abccec" }, 2));
        //        printTest(test(new String[] { "sun", "bed", "car" }, 1));
    }

    private static void printTest(String[] solution) {
        for (String test : solution) {
            System.out.println(test + ", ");
        }
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.split("")[n].compareTo(s2.split("")[n]) > 0) return 1;
                else if(s1.split("")[n].compareTo(s2.split("")[n]) == 0) return s1.compareTo(s2);
                else if(s1.split("")[n].compareTo(s2.split("")[n]) < 0) return -1;
                else return 0;
            }
        });
        return strings;
    }

    private static String[] test(String[] strings, int s) {
        for (int i = 0; i < strings.length - 1; i++) {
            int cnt = s;  //몇번 반복하는지 확인하기 위함
            int minIndex = i;
            for (int j = i; j < strings.length - 1; j++) {
                int value = strings[minIndex].split("")[s].compareTo(strings[j + 1].split("")[s]);
                if (value > 0) {
                    minIndex = j + 1;
                } else if (value == 0) {
                    while (value == 0) {
                        try {
                            value = strings[minIndex].split("")[++cnt].compareTo(strings[j + 1].split("")[cnt]);
                            if (value > 0) {
                                minIndex = j + 1;
                            }
                        } catch (Exception e) {
                            cnt = s;
                            while (value == 0) {
                                try {
                                    value = strings[minIndex].split("")[--cnt].compareTo(strings[j + 1].split("")[cnt]);
                                    if (value > 0) {
                                        minIndex = j + 1;
                                    }
                                } catch (Exception d) {
                                    value = 1;//                            value = 1;
                                }
                            }
                        }
                    }
                }
            }

            String temp = strings[i];
            strings[i] = strings[minIndex];
            strings[minIndex] = temp;

        }
        return strings;
    }

}
