import java.util.Scanner;

public class Program {
    public static Personnage personnageFactory(){
        Personnage personnage = new Personnage(100,50);
        System.out.println("Donne un nom à ton personnage :");
        personnage.setNom(Outils.ScannerStr());
        return personnage;
}}
