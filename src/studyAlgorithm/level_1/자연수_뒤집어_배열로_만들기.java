package studyAlgorithm.level_1;

/*
*  https://school.programmers.co.kr/learn/courses/30/lessons/12932
* */
public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        solution(12345L);
        solution2(12345L);
    }

    public static int[] solution(long n) {
        String[] longStr = Long
                .toString(n)
                .split("");

        int[] answer = new int[longStr.length];

        int cnt = 0;

        for (int i = answer.length-1; i >= 0; i--) {
            answer[cnt] = Integer.parseInt(longStr[i]);
            cnt++;
        }

        return answer;
    }

    public static int[] solution2(Long n) {
        return new StringBuilder()
                .append(n)
                .reverse()  // 문자를 뒤집는다.
                .chars()   // 아스키문자표로 stream으로 변환
                .map(Character::getNumericValue) //char를 int로 변경
                .toArray();
    }
}
