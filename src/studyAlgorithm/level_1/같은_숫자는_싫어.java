package studyAlgorithm.level_1;

import java.util.*;

/*
*
* https://school.programmers.co.kr/learn/courses/30/lessons/12906
* */
public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        solution(new int[] { 4, 4, 4, 3, 3 });
    }

    public static Integer[] solution(int[] arr) {
        List<Integer> integers = new ArrayList<>();
        int overLap = 10;

        for (int i = 0; i < arr.length; i++) {
            if (overLap != arr[i]) {
                overLap = arr[i];
                integers.add(arr[i]);
            }
        }
        System.out.println(integers);
        return integers.toArray(new Integer[integers.size()]);
    }
}
