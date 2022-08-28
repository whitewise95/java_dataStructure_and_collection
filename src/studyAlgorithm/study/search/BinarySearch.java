package studyAlgorithm.study.search;

/*
* 이진 검색
* */
public class BinarySearch {
    static int[] arr;

    public static void main(String[] args) {
        arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(binarySearch(7));
    }

    public static int binarySearch(int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int index = (low + high) / 2;

            if (arr[index] == target) {
                return index;
            } else if (arr[index] > target) {
                high = index - 1;
            } else {
                low = index + 1;
            }
        }
        return 100;
    }
}
