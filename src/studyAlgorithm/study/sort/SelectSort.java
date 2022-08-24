package studyAlgorithm.study.sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] test = solution();

        for (int ins : test) {
            System.out.print(ins + ", ");
        }
    }

    static int[] solution() {
        int[] randomNum = new int[] { 4, 6, 2, 9, 1 };

        for (int i = 0; i < randomNum.length-1; i++) {
            int cnt = 0;  //몇번 반복하는지 확인하기 위함
            int minIndex = i;
            for (int j = i; j < randomNum.length-1; j++) {
                cnt++;
                if(randomNum[minIndex] > randomNum[j+1]){
                    minIndex = j+1;
                }
            }
            System.out.println(cnt);
            int temp = randomNum[i];
            randomNum[i] = randomNum[minIndex];
            randomNum[minIndex] = temp;
        }
        return randomNum;
    }
}
