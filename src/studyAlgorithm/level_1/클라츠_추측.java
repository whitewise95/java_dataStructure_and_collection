package studyAlgorithm.level_1;

/*
*
*  https://school.programmers.co.kr/learn/courses/30/lessons/12943#
*
* */
public class 클라츠_추측 {
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }

    static public int solution(long num) {
        int answer = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
            if (answer == 500) {
                return -1;
            }
        }

        return answer;
    }

    public int collatz(int num) {
        long n = (long)num;
        for(int i =0; i<500; i++){
            if(n==1) return i;
            n = (n%2==0) ? n/2 : n*3+1;
        }
        return -1;
    }
}
