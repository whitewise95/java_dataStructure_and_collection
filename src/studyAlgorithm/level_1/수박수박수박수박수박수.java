package studyAlgorithm.level_1;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 * 수박수박수박수박수박수?
 * */
public class 수박수박수박수박수박수 {

    static StringBuffer sb;

    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static String solution(int n) {
        sb = new StringBuffer();
        int cnt = 0;

        oddOrEven(n, cnt);

        return sb.toString();
    }

    public static void oddOrEven(int n, int cnt) {
        if (cnt == n) {
            return;
        }

        switch (cnt % 2) {
        case 0:
            sb.append("수");
            break;
        case 1:
            sb.append("박");
            break;
        }

        oddOrEven(n, ++cnt);
    }
}