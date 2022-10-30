public class LeapYear {
    //TODO: Please open the readme.txt file and answer 4th question.
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
    }

    public static boolean isLeapYear(int year) {
        boolean dogruMu = year % 400 == 0;
        if (year >= 1 && year < 9999) {
            if (dogruMu) {
                System.out.println(String.format(dogruMu + " since %d is a leap year", year));
            } else {
                System.out.println(String.format(dogruMu + " since %d is not a leap year", year));
            }
        } else {
            dogruMu = false;
            System.out.println(dogruMu + " since the parameter is not in range (1-9999)");
        }
        return dogruMu;
    }

}
