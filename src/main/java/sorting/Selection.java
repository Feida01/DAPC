package sorting;

public class Selection implements SortingAlgorithm {
    public int[] sort(int[] unsortedArray) {
        int[] sortedArray;
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int temp = unsortedArray[minimumIndex];
            unsortedArray[minimumIndex] = unsortedArray[i];
            unsortedArray[i] = temp;
        }
        sortedArray = unsortedArray;
        return sortedArray;
    }
}
