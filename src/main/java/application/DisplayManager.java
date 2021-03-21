package application;

import factories.SortingAlgorithmFactory;

import java.util.Arrays;
import java.util.Random;

//TODO: REMOVE HIGH COUPLING!
public class DisplayManager {
    final String[] sortingAlgorithms = {"BUBBLE", "SELECTION", "INSERTION"};
    int amount;
    int[] testArray;
    Time timer = new Time();
    SortingAlgorithmFactory algorithmFactory = new SortingAlgorithmFactory();

    public DisplayManager(int inputAmount) {
        amount = inputAmount;
        testArray = generateRandomReverseData(amount);
    }

    public void display() {
        System.out.println("Input data: " + Arrays.toString(testArray));
        for (String sortingAlgorithm : sortingAlgorithms) {
            System.out.println("============================================");
            timer.startTimer();
            algorithmFactory.getSortingAlgorithm(sortingAlgorithm).sort(testArray);
            timer.endTimer();
            System.out.println(sortingAlgorithm + "_SORT Time in nanoseconds: " + timer.getDuration());
        }

    }

    private int[] generateRandomTestData(int amount) {
        int[] testData = new int[amount];
        int boundary = 10000;
        Random rand = new Random();

        for (int i = 0; i < testData.length; i++) {
            testData[i] = rand.nextInt(boundary);

        }
        return testData;
    }

    private int[] generateRandomReverseData(int amount) {
        int[] testData = new int[amount];

        for (int i = 0; i < testData.length; i++) {
            testData[i] = amount;
            amount--;
        }
        return testData;
    }
}
