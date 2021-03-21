package application;

public class Time {
    long endTime = 0;
    long startTime = 0;

    public void startTimer() {
       startTime = System.nanoTime();
    }

    public void endTimer() {
        endTime = System.nanoTime();
    }

    public long getDuration() {
        return endTime - startTime;
    }
}
