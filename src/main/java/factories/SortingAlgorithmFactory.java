package factories;

import sorting.Bubble;
import sorting.Insertion;
import sorting.Selection;
import sorting.SortingAlgorithm;

public class SortingAlgorithmFactory {
    final String SELECTION_SORT = "SELECTION";
    final String INSERTION_SORT = "INSERTION";
    final String BUBBLE_SORT = "BUBBLE";

    public SortingAlgorithm getSortingAlgorithm(String sortingAlgorithmName) {
        if (sortingAlgorithmName == null) {
            return null;
        }

        if (sortingAlgorithmName.equalsIgnoreCase(SELECTION_SORT)) {
            return new Selection();
        } else if (sortingAlgorithmName.equalsIgnoreCase(INSERTION_SORT)) {
            return new Insertion();
        } else if (sortingAlgorithmName.equalsIgnoreCase(BUBBLE_SORT)) {
            return new Bubble();
        }

        return null;
    }
}
