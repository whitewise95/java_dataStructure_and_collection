package studyAlgorithm.level_1;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/87389
 * */
public class 나머지가_1이_되는_수_찾기 {

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution2(12));
    }

    public static Integer solution(Integer n) {
        int cnt = 1;
        return findMinNum(n, cnt);
    }

    public static Integer findMinNum(Integer n, Integer cnt) {
        if (n % cnt == 1) {
            return cnt;
        }
        return findMinNum(n, ++cnt);
    }

    public static Integer solution2(Integer n) {
        int cnt = 1;

        while (true) {
            if (n % cnt == 1) {
                return cnt;
            }
            cnt++;
        }
    }
}
