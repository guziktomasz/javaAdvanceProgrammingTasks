package Task16;

import java.util.stream.Stream;

public enum Runner {
    BEGINNER(260, 999),
    INTERMEDIATE(220, 260),
    ADVANCED(1, 220);

    private int minTime;
    private int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int timeMarathon){
        /*if (timeMarathon >= BEGINNER.getMinTime() && timeMarathon <= BEGINNER.getMaxTime()){
            return Runner.BEGINNER;
        } else if (timeMarathon >= INTERMEDIATE.getMinTime() && timeMarathon <= INTERMEDIATE.getMaxTime()){
            return Runner.INTERMEDIATE;
        } else if (timeMarathon >= ADVANCED.getMinTime() && timeMarathon <= ADVANCED.getMaxTime()) {
            return Runner.ADVANCED;
        }*/
        return Stream.of(values())
                .filter(runner -> runner.minTime < timeMarathon && timeMarathon <= runner.maxTime)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Podany czas jest spoza mozliwych przedziałów: " + timeMarathon));
    }

    public int getMinTime() {
        return minTime;
    }

    public void setMinTime(int minTime) {
        this.minTime = minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }
}
