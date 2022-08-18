package studyAlgorithm.study;

/*
 * 시간 복잡도 대해서
 * */
public class BigO {

    /*
     *  O(1) 알고리즘
     * */
    public void bigO1(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[0]);
        }
    }

    /*
     *  O(n) 알고리즘
     * */
    public void bigON(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    /*
     *  O(n) 알고리즘
     * */
    public void bigO2N(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    /*
     *  o(n^)
     * */
    public void bigON2(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                System.out.println(i + j);
            }
        }
    }

    /*
     *  o(nM)
     * */
    public void bigONM(int[] n, int[] m) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println(i + j);
            }
        }
    }

    /*
     *  o(2ⁿ)  Fibonacci
     * */
    public int bigO2ⁿ(int n, int[] r) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return r[n];
        }
        return r[n] = bigO2ⁿ(n - 1, r) + bigO2ⁿ(n - 2, r);
    }

    /*
     *  o(logN)
     * */
    public int bigOLogN(int k, int[] arr, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = (s + e) / 2;
        if (arr[m] == k) {
            return m;
        } else if (arr[m] > k) {
            return bigOLogN(k, arr, s, m - 1);
        } else {
            return bigOLogN(k, arr, m + 1, e);
        }
    }

    /*
     *  o(sqrt(n))
     * */
    public int bigOSqrtN(int k, int[] arr, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = (s + e) / 2;
        if (arr[m] == k) {
            return m;
        } else if (arr[m] > k) {
            return bigOLogN(k, arr, s, m - 1);
        } else {
            return bigOLogN(k, arr, m + 1, e);
        }
    }



}
