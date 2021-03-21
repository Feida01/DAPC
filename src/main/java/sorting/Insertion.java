package sorting;

public class Insertion implements SortingAlgorithm {
    public int[] sort(int[] unsortedArray) {
        int[] sortedArray;
        for (int i = 1; i < unsortedArray.length; i++) {
            int temp = unsortedArray[i];
            int j = i - 1;
            while (j >= 0 && temp < unsortedArray[j]) {
                unsortedArray[j + 1] = unsortedArray[j];
                j = j - 1;
            }
            unsortedArray[j + 1] = temp;
        }
        sortedArray = unsortedArray;
        return sortedArray;
    }
}
