package CookYourLasagna;

public class Lasagna {
    private int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }
    private int preparationTimeInMinutes(int numberOfLayers) {
        return 2*numberOfLayers;
    }
    
    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
    }
}