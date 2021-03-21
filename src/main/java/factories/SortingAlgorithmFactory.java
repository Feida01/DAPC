package factories;

import sorting.Insertion;
import sorting.Selection;
import sorting.SortingAlgorithm;

public class SortingAlgorithmFactory {

    public SortingAlgorithm getSortingAlgorithm(String sortingAlgorithmName) {
        if (sortingAlgorithmName == null) {
            return null;
        }

        if (sortingAlgorithmName.equalsIgnoreCase("SELECTION")) {
            return new Selection();
        } else if (sortingAlgorithmName.equalsIgnoreCase("INSERTION")) {
            return new Insertion();
        }

        return null;
    }
}
