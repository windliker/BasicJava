package org.windlike.test.simpleAlgorithms;

public class SimpleAlgorithms {
    public static void main(String[] args) {
        // 数组反转
        int[] arr = new int[] {1, 2, 3, 4, 5, 6};
        // soutv
        SimpleAlgorithms.arrayReverse(arr);
//        Arrays.stream(arr).forEachOrdered(System.out::println);
    }

    public static void arrayReverse(int[] arr) {
        for (int left = 0, right = arr.length - 1, tmp; left < right; left++, right--) {
            // arr[left] and arr[right] exchange value
            tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
}
