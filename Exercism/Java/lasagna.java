public class Lasagna {
    public static int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int actualMin){
        return Lasagna.expectedMinutesInOven() - actualMin;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layers) {
        return 2*layers;
    }
    // TODO: define the 'totalTimeInMinutes()'
    public static int totalTimeInMinutes(int layers, int mins){
        return preparationTimeInMinutes(layers) + mins;
    }
}
