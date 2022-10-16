public class SpeedConverter {
    //TODO: Please open the readme.txt file and answer 1st and 2nd questions.
    public static void main(String[] args) {
        toMilesPerHour(1.5);
        toMilesPerHour(10.25);
        toMilesPerHour(-5.6);
        toMilesPerHour(25.42);
        toMilesPerHour(75.114);
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour (double kilometersPerHour ) {
        long miles;
        if (kilometersPerHour >= 0) {
            miles = Math.round(kilometersPerHour / 1.609);
            System.out.println(miles);
        } else {
            miles = -1;
            System.out.println(miles);
        }
        return miles;
    }

    public static void printConversion (double kilometersPerHour) {
        long miles;
        if (kilometersPerHour >= 0) {
            miles = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
