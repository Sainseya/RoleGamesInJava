public class Personnage {

    //Définir les attributs d'instances.
    private int pointDeVie;
    private int degat;
    private String nom = "";

    //constructor: définit comment l'objet doit être construit.
    public  Personnage(int pointDeVie, int degat, String nom){
        this.pointDeVie =pointDeVie;
        this.degat = degat;
        this.nom = nom;
    }

    public  Personnage(int pointDeVie, int degat){
        this.pointDeVie =pointDeVie;
        this.degat = degat;
    }
    public  Personnage(){
    }

    //Getter & Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return  "nom:" +"["+this.nom+"]"+
                ", point de vie: " +"["+this.pointDeVie+"]"+
                ", attaque: "+"["+this.degat+"]";
    }
}
