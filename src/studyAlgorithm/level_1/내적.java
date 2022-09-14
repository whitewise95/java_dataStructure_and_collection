package studyAlgorithm.level_1;

import java.util.Arrays;

/*
 * 내적
 * https://school.programmers.co.kr/learn/courses/30/lessons/70128
 * */
public class 내적 {
    static int cnt = 0;
    static int[] answer;

    public static void main(String[] args) {
        System.out.println(solution(new int[] { -1, 0, 1 }, new int[] { 1, 0, -1 }));
    }

    public static int solution(int[] a, int[] b) {
        answer = new int[a.length];
        dotProduct(a, b);

        return arrayAllIndexSum(answer);
    }

    public static void dotProduct(int[] a, int[] b) {
        if (a.length == cnt) {
            return;
        }
        answer[cnt] = a[cnt] * b[cnt++];
        dotProduct(a, b);
    }

    public static int arrayAllIndexSum(int[] a) {
        return Arrays.stream(a).sum();
    }
}
