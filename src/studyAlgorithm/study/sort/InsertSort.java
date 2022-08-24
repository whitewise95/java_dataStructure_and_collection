package studyAlgorithm.study.sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] test = solution();

        for (int ins : test) {
            System.out.print(ins + ", ");
        }
    }

    static int[] solution() {
        int[] randomNum = new int[] { 4, 6, 2, 9, 1 };

        for (int i = 0; i < randomNum.length - 1; i++){
            int cnt =0;  //몇번 반복하는지 확인하기 위함
            int j = i;
            while (randomNum[j] > randomNum[j+1]){
                int temp = randomNum[j];
                randomNum[j] = randomNum[j+1];
                randomNum[j+1] = temp;
                cnt++;
                if(j > 0){
                    j--;
                }
            }
            System.out.println(cnt);
        }
        return randomNum;
    }
}
