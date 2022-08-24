package studyAlgorithm.study.sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] test = solution();

        for (int ins : test) {
            System.out.print(ins + ", ");
        }
    }

    static int[] solution() {
        int[] arr = new int[] { 4, 6, 2, 9, 1 };

        for (int i = 0; i < arr.length-1; i++) {
            int cnt = 0;  //몇번 반복하는지 확인하기 위함
            int minIndex = i;
            for (int j = i; j < arr.length-1; j++) {
                cnt++;  // 반복할 때마다 카운트
                if(arr[minIndex] > arr[j+1]){
                    minIndex = j+1;
                }
            }
            System.out.println(cnt);
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
