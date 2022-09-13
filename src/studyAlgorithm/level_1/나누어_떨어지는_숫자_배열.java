package studyAlgorithm.level_1;

import java.util.*;
import java.util.stream.Collectors;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 * */
public class 나누어_떨어지는_숫자_배열 {
    static LinkedList<Integer> answer;

    public static void main(String[] args) {
        solution(new int[]{5, 9, 7, 10}, 5);
        System.out.println(answer);
        answer = new LinkedList<>();

        solution(new int[]{2, 36, 1, 3}, 1);
        System.out.println(answer);
        answer = new LinkedList<>();

        solution(new int[]{3,2,6}, 10);
        System.out.println(answer);
        answer = new LinkedList<>();
    }

    public static Integer[] solution(int[] arr, int divisor) {
        answer = new LinkedList<>();
        recursion(arr, divisor, 0);
        return  answer.stream().sorted()
                .collect(Collectors.toList())
                .toArray(new Integer[answer.size()]);
    }

    public static void recursion(int[] arr, int divisor, int index) {
        if (arr.length == index) {
            if(answer.size() == 0){
                answer.add(-1);
            }
            return;
        }

        if (arr[index] % divisor == 0) {
            answer.add(arr[index]);
        }

        recursion(arr, divisor, index + 1);
    }
}
