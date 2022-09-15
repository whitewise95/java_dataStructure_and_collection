package studyAlgorithm.level_1;

import java.util.Arrays;

/*
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12931
 * */
public class 자릿수_더하기 {

    public static void main(String[] args) {
        System.out.println(solution2(987));
        System.out.println(solution(987));
    }

    /* 직접 푼 문제풀이 */
    public static int solution(int n) {
        return Arrays.stream(Integer.toString(n).split(""))
                .map(s -> Integer.parseInt(s))
                .reduce((n1, n2) -> n1 + n2)
                .get();
    }


    /* 맘에든 다른사람 문제풀이 이유는 변환이 없고 BigO(n)이기 때문에 */
    public static int solution2(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
