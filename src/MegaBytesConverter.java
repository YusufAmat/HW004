public class MegaBytesConverter {
    //TODO: Please open the readme.txt file and answer 3rd question.
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes>=0){
        int kiloByts = kiloBytes % 1024 ;
        int megaBytes = (kiloBytes - kiloByts) / 1024;
        System.out.println("\"" + kiloBytes + " KB= " + megaBytes + " MB and " + kiloByts + " KB\"");
        }else {
            System.out.println("\"Invalid Value\" because parameter is less than 0.");
        }
    }
}