package javarevisited.arrays.top30;

public class NonRepeatedNumber {
    public int getNonRepeatedNumber(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != inputArray[i + 1])
                return inputArray[i];
            i++;
        }
        return 0;
    }

    public int getNonRepeatedNumberUnSortedArray(int[] inputArray) {
        int result = 0;
        for (int n : inputArray)
            result ^= n;

        return result;
    }
}
