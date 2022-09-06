package studyAlgorithm.study.sort;

public class mergeSort {

    /*
    *  mian 메소드입니다.
    * */
    public static void main(String[] args) {
        int[] test = new int[] { 8,3,6,4,5,7,1,2,9 };


        sort(test, 0, test.length);
        for (int t : test) {
            System.out.println(t);
        }
    }

    /*
    *  Divide
    *  재귀함수로 초기상태의 배열에서 최소 단위까지 분할합니다.
    * */
    private static void sort(int[] arr, int low, int high) {
        // 비교대상이 없을 정도로 분할이 되면 리턴합니다.
        if (high - low < 2) {
            return;
        }

        int mid = (low + high) / 2;

        //0 ~ mid 까지 분할
        sort(arr, 0, mid);

        //mid ~ length 까지 분할
        sort(arr, mid, high);

        //병합하는 메소드
        merge(arr, low, mid, high);
    }

    /*
    * Conquer
    * 정렬하면서 병합하는 과정의 메소드
    * */
    private static void merge(int[] arr, int low, int mid, int high) {
        //비교대상의 데이터의 수 만큼 새로운 배열을 만든다.
        int[] temp = new int[high - low];
        int t = 0, l = low, h = mid;

        // 크기가 작은 데이터부터 temp에 담게된다.
        while (l < mid && h < high) {
            if (arr[l] < arr[h]) {
                temp[t++] = arr[l++];
            } else {
                temp[t++] = arr[h++];
            }
        }

        // 두개의 배열에서 먼저 끝난쪽의 반대 배열을 모두 temp에 담는다.
        while (l < mid) {
            temp[t++] = arr[l++];
        }

        while (h < high) {
            temp[t++] = arr[h++];
        }


        // 정렬된 temp 배열을 arr에 덮어 씌운다.
        for (int i = low; i < high; i++) {
            arr[i] = temp[i - low];
        }
    }
}
