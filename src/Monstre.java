public class Monstre extends Personnage{
    public Monstre(int pointDeVie, int degat, String nom) {
        super(pointDeVie, degat, nom);
    }


}
abstract class AbstractCombattant{
    public String nom;
    public int pointDeVie;
    public int degats;

    public AbstractCombattant(String nom, int pointDeVie, int degats) {
        this.nom = nom;
        this.pointDeVie = pointDeVie;
        this.degats = degats;
    }

    public AbstractCombattant() {

    }
    @Override
    public String toString() {
        return  "nom='" + nom + '\'' +
                ", pdv=" + pointDeVie +
                ", degats=" + degats +
                '}';
    }
}
