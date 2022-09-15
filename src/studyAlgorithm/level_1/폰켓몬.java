package studyAlgorithm.level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
*   https://school.programmers.co.kr/learn/courses/30/lessons/1845
* */
public class 폰켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
        System.out.println(solution(new int[]{3,3,3,2,2,4}));
        System.out.println(solution(new int[]{3,3,3,2,2,2}));
    }

    /* 문제풀이*/
    public static int solution(int[] nums) {
        int[] distinctNums = Arrays.stream(nums)
                .distinct()
                .toArray();

        int myPokemon = nums.length / 2;

        if(myPokemon > distinctNums.length){
            return distinctNums.length;
        }

        return myPokemon;
    }

    /* 맘에든 다른사람 문제풀이 이유는 stream을 썼다면 그외에 코드는 복잡하게 대입이나 조건문 있는 것보단 stream으로 끝내는게 맞다고 생각합니다. */
    public static int solution2(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }
}
