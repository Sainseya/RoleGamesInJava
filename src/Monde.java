public class Monde {
    public static Personnage personnageFactory(){
        System.out.println("Donne un nom à ton personnage :");
        Personnage personnage = new Personnage(100,50);
        personnage.setNom(Outils.ScannerStr());
        return personnage;
    }

    public static void afficherInformation(){
        System.out.println(personnageFactory());
    }
}
