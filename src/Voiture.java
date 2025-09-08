public class Voiture {
    // Attributs
    String marque;
    String couleur;

    // Constructeur
    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
    }

    // Méthode pour afficher les infos
    public void afficherInfos() {
        System.out.println("Marque : " + marque + ", Couleur : " + couleur);
    }

    // Le main doit être À L’INTÉRIEUR de la classe
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Toyota", "Rouge");
        Voiture v2 = new Voiture("BMW", "Noire");
        Voiture v3 = new Voiture("Renault", "Bleue");

        v1.afficherInfos();
        v2.afficherInfos();
        v3.afficherInfos();
    }
}
