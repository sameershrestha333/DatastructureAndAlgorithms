package softwaretestinghelp;

public class SecondHighestNumberInArray {
    public static void main(String[] args) {
        int arr[] = {14, 46, 47, 94, 94, 52, 86, 36, 94, 89};
        System.out.println(getSecondHighestNumber(arr));
    }

    private static int getSecondHighestNumber(int[] arr) {
        int secondHighest = arr[0];
        int highest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
            }
        }

        return secondHighest;
    }

}
