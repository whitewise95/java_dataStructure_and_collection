package studyAlgorithm.study.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] test = solution();

        for (int ins : test) {
            System.out.print(ins + ", ");
        }
    }

    static int[] solution() {
        int[] arr = new int[] { 4, 6, 2, 9, 1 };

        for (int i = 0; i < arr.length - 1; i++){
            int cnt =0;  //몇번 반복하는지 확인하기 위함
            int j = i;
            while (arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                cnt++;  //반복되는 횟수를 카운트한다
                if(j > 0){
                    j--;
                }
            }
            System.out.println(cnt);
        }
        return arr;
    }
}
