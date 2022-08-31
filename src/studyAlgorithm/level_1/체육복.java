package studyAlgorithm.level_1;

import java.util.*;
import java.util.stream.IntStream;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/42862
 * */
public class 체육복 {

    public static void main(String[] args) {
        System.out.println(solution(10, new int[] { 1,2,3 }, new int[] { 1,2,7 }));
    }

    static public int solution(int n, int[] lost, int[] reserve) {
        int cnt= 0,again = 0;
        List<Integer> tempList = new ArrayList<>();
        for (int value : reserve){
            tempList.add(value);
        }

        Iterator iterator = tempList.listIterator();
        boolean isAgain = false;
        for (Integer rValue : lost) {
            if(iterator.hasNext()){

                int value =  isAgain ? again : (int) iterator.next();

                if(value == rValue || value - 1 == rValue || value + 1 == rValue) {
                    cnt++;
                    iterator.remove();
                    isAgain = false;
                } else {
                    isAgain = true;
                    again = value;
                }
            }
        }
        return n - lost.length + cnt;
    }
}
