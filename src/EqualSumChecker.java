public class EqualSumChecker {
    //TODO: Please open the readme.txt file and answer 5th question.
    public static void main(String[] args) {
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 1);
    }

    public static boolean hasEqualSum(int x, int y, int z) {
        boolean esitMi = (x + y == z);
        System.out.println(esitMi + " since " + x + " + " + y + " is not equal to " + z);
        return esitMi;
    }
}