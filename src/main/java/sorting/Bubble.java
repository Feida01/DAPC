package sorting;

public class Bubble implements SortingAlgorithm{
    public int[] sort(int[] unsortedArray) {
        int[] sortedArray;
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            for (int j = 0; j < unsortedArray.length - i - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }
        sortedArray = unsortedArray;
        return sortedArray;
    }
}
