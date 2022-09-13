package studyAlgorithm.study.recursion;

/*
 * 재귀함수의 기본 예제
 * */
public class Recursion {

    public static void main(String[] args) {
        /*
        * 에러 발생
        * *** java.lang.instrument ASSERTION FAILED ***: "!errorOutstanding" with message transform method call failed at JPLISAgent.c line: 844
        *
        * countDownFail(60);
        * */


        // 정상
        countDownSuccess(60);
    }

    public static void countDownFail(int num) {
        System.out.println(num);
        countDownFail(num - 1);
    }

    public static void countDownSuccess(int num) {
        if(num <= 0){
            return;
        }

        System.out.println(num);
        countDownSuccess(num - 1);
    }
}
