package studyAlgorithm.study.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] test = solution();

        for (int ins : test) {
            System.out.print(ins + ", ");
        }
    }

    static int[] solution() {
        int[] randomNum = new int[] { 4, 6, 2, 9, 1 };

        for (int i = 0; i < randomNum.length - 1; i++) {
            for (int j = 0; j < randomNum.length - 1 - i; j++) {
                if (randomNum[j] > randomNum[j + 1]) {
                    int temp = randomNum[j];
                    randomNum[j] = randomNum[j + 1];
                    randomNum[j + 1] = temp;
                }
            }
        }

        return randomNum;
    }
}
