package studyAlgorithm.level_2;

import java.util.*;

/*
 *  https://school.programmers.co.kr/learn/courses/30/lessons/60057
 *  22/08/18
 * */
public class 문자열압축_다시풀어보기 {
    public static void main(String[] args) {
        //Test 데이터
        System.out.println(solution2("aabbaccc"));
        System.out.println(solution2("ababcdcdababcdcd"));
        System.out.println(solution2("abcabcdede"));
        System.out.println(solution2("abcabcabcabcdededededede"));
        System.out.println(solution2("xababcdcdababcdcd"));
    }

    public static int solution(String s) {
        int answer = 0, cnt = 1;

        String[] temp = s.split("");
        boolean isContinue = true;
        List<Integer> answerList = new ArrayList<>();
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        while (isContinue) {

            // 단위마다 자른 문자열을 list에 담는 행위
            List<String> sumStringList = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < temp.length; i++) {
                sb.append(temp[i]);
                if (i != 0 && i % cnt == 0) {
                    sumStringList.add(sb.toString());
                    sb = new StringBuilder();
                }
            }

            //자른 문자열의 겹칠수 있는 횟수 구하기
            for (int i = 0; i < sumStringList.size(); i++) {
                int overlap = 0;
                String tempString = sumStringList.get(i);
                for (int j = 0; j < sumStringList.size(); j++) {
                    if (i == j) {
                        continue;
                    }
                    if (tempString.equals(sumStringList.get(j))) {
                        overlap++;
                    }
                }
                stringIntegerMap.put(tempString, overlap);
            }

            //문자열을 제일 많이 겹치는 값 구하기
            cnt++;
            if (cnt > s.length()) {
                StringBuilder stringBuilder = null;
                int topLength = 0;
                for (String key : stringIntegerMap.keySet()) {
                    if (stringIntegerMap.get(key) > topLength) {
                        stringBuilder = new StringBuilder(key);
                        topLength = stringIntegerMap.get(key);
                    }
                }
                System.out.println(stringBuilder.toString());
                if(stringBuilder != null) {
                    String test = "";
                    for (int i = 0; i < topLength - 1; i++) {
                        if (i == 0) {
                            test = "" + topLength;
                        }
                        test += stringBuilder.toString();
                    }

                    s.replace(stringBuilder.toString(), test);

                    isContinue = false;
                    System.out.println(test);
                    answer = test.length();
                } else {
                    continue;
                }
            }

        }

        return answer;
    }

//    aabbaccc  length = 8
    public static int solution2(String s) {
        int min = s.length();  //8
        int len = s.length()/2+1;  //5
        for(int i = 1; i < len; i++) {
            String before = "";
            int sum = 0;
            int cnt = 1;
            for(int j = 0; j < s.length();) {
                int start = j;
                j = (j+i > s.length()) ? s.length():j+i;
                String temp = s.substring(start, j);
                if(temp.equals(before)) {
                    cnt++;
                } else {
                    if(cnt != 1) {
                        sum += (int)Math.log10(cnt)+1;
                    }
                    cnt = 1;
                    sum+=before.length();
                    before = temp;
                }
            }
            sum+=before.length();
            if(cnt != 1) {
                sum += (int)Math.log10(cnt)+1;
            }
            min = (min > sum) ? sum : min;
        }

        return min;
    }
}
