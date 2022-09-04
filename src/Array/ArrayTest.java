package Array;

public class ArrayTest {
    public static void main(String[] args) {
        //배열 선언
        int[] numbers;
        String[] strings;
        boolean[] booleans;
        char[] chars;

        // 크기 정해주기                초기값
        numbers = new int[5];         // 0
        strings = new String[4];      // null
        booleans = new boolean[3];    // false
        chars = new char[2];          // ''

        int[] scores = new int[9];

        //배열 조회
        System.out.println(scores[0]);  //0
        System.out.println(scores[1]);  //0
        System.out.println(scores[2]);  //0
        System.out.println(scores[3]);  //0
        System.out.println(scores[4]);  //0
        System.out.println(scores[5]);  //0
        System.out.println(scores[6]);  //0
        System.out.println(scores[7]);  //0
        System.out.println(scores[8]);  //0
        //        System.out.println(scores[9]);  //error

        //배열 초기화
        scores[0] = 65;
        scores[1] = 74;
        scores[2] = 23;
        scores[3] = 75;
        scores[4] = 68;
        scores[5] = 96;
        scores[6] = 88;
        scores[7] = 98;
        scores[8] = 54;

        //배열은 선언과 동시에 초기화도 진행할 수 있습니다.
        int[] numbers2 = { 1, 2, 3, 4, 5, 6, 7 };
        numbers2 = new int[] { 1, 5, 3, 5, 9, 3 };

        //배열 조회 예제 for-loop
        // [1]
        for (int number : numbers2) {
            System.out.println(number);
        }

        // [2]
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        //데이터 초기화 예제
        numbers2 = new int[5];
        int cnt = 2;    

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = cnt * i;  // 0, 2, 4, 6, 8
        }

    }
}
