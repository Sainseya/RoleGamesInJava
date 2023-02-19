import java.util.Scanner;

public class Outils {
    public static String ScannerStr(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int ScannerInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static Double ScannerDou(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static char ScannerChar(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }






}
