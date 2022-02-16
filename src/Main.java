public class Main {

    public static void main(String[] args) {

        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

        // task 6

        boolean barking = BarkingDog.shouldWakeUp(true, 9);
        System.out.println(barking);
    }
}
