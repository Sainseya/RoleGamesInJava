public class Personnage extends AbstractCombattant{

    //Définir les attributs d'instances.
    private int pointDeVie;
    private int degats;
    private String nom = "";

//constructor: définit comment l'objet doit être construit.
    public  Personnage(int pointDeVie, int degats, String nom){
        super();
        this.pointDeVie =pointDeVie;
        this.degats = degats;
        this.nom = nom;
    }

    public  Personnage(int pointDeVie, int degats){
        super();
        this.pointDeVie =pointDeVie;
        this.degats = degats;
    }
    public  Personnage(){
    }

    //Getter & Setter
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return  "nom:" +"["+this.nom+"]"+
                ", point de vie: " +"["+this.pointDeVie+"]"+
                ", attaque: "+"["+this.degats+"]";
    }
}
