package basics;

public class LargestSum {
    public static boolean findLargestSum(int[] arr) {
        int largest = arr[0];
        for (int j : arr) {
            if (j > largest) {
                largest = j;
            }
        }

        int sum = 0;
        for (int j : arr) {
            if (j == largest) {
                continue;
            }
            sum += j;
        }

        return sum >= largest;

    }

    public static void main(String[] args) {
        int[] a = {1, 5, 23, 10, 7, 2};
        System.out.println(findLargestSum(a));
    }
}
