package studyAlgorithm.level_1;

import java.util.*;
import java.util.stream.Collectors;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/42862
 * */
public class 체육복 {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[] { 2, 4 }, new int[] { 2, 4, 5 }));
        System.out.println(solution(5, new int[] { 2, 4 }, new int[] { 1, 3, 5 }));
        System.out.println(solution(5, new int[] { 2, 4 }, new int[] { 3 }));
        System.out.println(solution(3, new int[] { 3 }, new int[] { 1 }));
    }

    static public int solution(int n, int[] lostArray, int[] reserveArray) {
        List<Integer> i1 = Arrays.stream(lostArray).boxed().collect(Collectors.toList());

        List<Integer> test2 = i1.stream().collect(Collectors.toList());

        List<Integer> test3 = i1.stream().filter(integer ->
                !Arrays.stream(reserveArray).boxed().collect(Collectors.toList()).stream().anyMatch(lost -> {
                            if (integer == lost) {
                                test2.remove(integer);
                                return true;
                            }
                            return false;
                        }
                )
        ).collect(Collectors.toList());

        if (test2.size() == 0) {
            return n;
        } else if (test3.size() == 0 && test2.size() == 0) {
            return n;
        } else if (test3.size() == 0 && test2.size() != 0) {
            return n - test2.size();
        } else if (test3.size() != 0 && test2.size() == 0) {
            return n;
        }

        Iterator<Integer> integers = Arrays.stream(reserveArray).boxed().collect(Collectors.toList()).iterator();
        int cnt = 0;
        for (int lost : lostArray) {
            int before = -1;
            if(before == -1){
                if (integers.hasNext()) {
                    int reserve = integers.next();
                    if (reserve == lost - 1 || reserve == lost + 1 || reserve == lost) {
                        integers.remove();
                        cnt++;
                        before = -1;
                        continue;
                    } else {
                        before = reserve;
                    }
                }
            } else {
                if (before == lost - 1 || before == lost + 1 || before == lost) {
                    integers.remove();
                    cnt++;
                    before = -1;
                    continue;
                }
            }


        }

        return n - (lostArray.length - cnt);
    }
}
