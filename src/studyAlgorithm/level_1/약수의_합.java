package studyAlgorithm.level_1;

import java.util.stream.IntStream;

/*
 *   https://school.programmers.co.kr/learn/courses/30/lessons/12928
 * */
public class 약수의_합 {
    public static void main(String[] args) {
        System.out.println(solution(3000));
    }

    public static int solution(int n) {
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        }
        return IntStream.range(2, n - 1)
                .filter(value -> n % value == 0)
                .sum() + 1 + n;
    }
}
