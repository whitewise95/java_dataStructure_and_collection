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
        if (str.length() <= 1) {
            return true;
        }

        int endIndex = str.length() - 1;

        String first = str;
        String last = str.substring(endIndex);

        if (first.charAt(0) != last.charAt(0)) {
            return false;
        }

        return isPalindromeRecursion(str.substring(1, endIndex--));
    }

}
