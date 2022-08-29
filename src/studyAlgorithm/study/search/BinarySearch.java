package studyAlgorithm.study.search;

/*
* 이진 검색
* */
public class BinarySearch {
    static int[] iArr;
    static String[] sArr;

    public static void main(String[] args) {
        iArr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        sArr = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

        System.out.println(binarySearchNumber(7));
        System.out.println(binarySearchString("f"));
    }

    public static int binarySearchNumber(int target) {
        // 1번 low는 배열의 맨 첫번째 index이고 higt는 배열의 맨 마지막 index입니다.
        int low = 0;
        int high = iArr.length - 1;


        // 2번
        while (low <= high) {

            // 2-4 : low와 high를 다시 설정해준 번위의 가운데 index를 찾아낸다.
            int index = (low + high) / 2;

            // 2-1 : 타겟값과 해당 index 가 같다면 그 index를 반환합니다.
            if (iArr[index] == target) {
                return index;

            // 2-2 : 타겟값이 해당 index보다 작다면 그 인덱스 보다 높은 index가 필요없으니 high 를 해당 index로 변경해
            //       해당 index보다 위 index를 보지 않도록 설정해줍니다.
            } else if (iArr[index] > target) {
                high = index - 1;

            // 2-3 :  2-2와 반대로 해당 타겟값이 index보다 크다면 아래 index를 보지 않도록 low를 해당 index로 변경한다.
            } else {
                low = index + 1;
            }
        }
        return 100;
    }

    public static int binarySearchString(String target) {
        int low = 0;
        int high = sArr.length - 1;

        while (low <= high) {

            int index = (low + high) / 2;

            if (sArr[index].equals(target)) {
                return index;
            } else if (sArr[index].compareTo(target) > 0) {
                high = index - 1;
            } else {
                low = index + 1;
            }
        }
        return 100;
    }
}
