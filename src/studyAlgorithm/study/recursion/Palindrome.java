package studyAlgorithm.study.recursion;

/*
 * 재귀합수 회문검사
 * 회문이란 거꾸로해도 똑같은 글자다.
 * 토마토
 * 별똥별
 * 스위스
 * 주어진 글자가 회문글자인지 검사하는 것
 * */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("스위스"));
        System.out.println(isPalindrome("별똥별"));
        System.out.println(isPalindrome("소주만병만주소"));
        System.out.println(isPalindrome("이것이회문이것이"));


        System.out.println(isPalindromeRecursion("스위스"));
        System.out.println(isPalindromeRecursion("별똥별"));
        System.out.println(isPalindromeRecursion("소주만병만주소"));
        System.out.println(isPalindromeRecursion("이것이회문이것이"));
    }

    /*
    * 반복문으로 회문검사하는 예제
    * */
    public static boolean isPalindrome(String str) {
        while (str.length() != 1) {
            int endIndex = str.length() - 1;

            String first = str.substring(0);
            String last = str.substring(endIndex);

            if (first.charAt(0) != last.charAt(0)) {
                return false;
            }

            str = str.substring(1, endIndex--);
        }
        return true;
    }


    /*
     * 재귀로 회문검사하는 예제
     * */
    public static boolean isPalindromeRecursion(String str) {
        // 조건문으로 str의 길이가 하나만 남았을 경우 빠져나온다.
        if (str.length() <= 1) {
            return true;
        }
        /*
         * 예제에 나온 회문검사는 문자열을 자르기 때문에
         * first는 무조건 0 가리키도록 한다.
         * last는 str길이에 -1를 하여 비교위치를 변경해준다. (원래는 -2가 맞지만 재귀호출 당시 인자를 -1 한 값이 필요함)
         */
        int endIndex = str.length() - 1;

        String first = str;
        String last = str.substring(endIndex);

        // 각 first와 last를 비교후 다르다면 false를 반환 아니라면 재귀호출하게 된다.
        if (first.charAt(0) != last.charAt(0)) {
            return false;
        }

        // 호출할 때  str.length() - 1 한 값으로 먼저 문자열을 자르고 -1를 해준다.
        return isPalindromeRecursion(str.substring(1, endIndex--));
    }
}
