import java.util.List;
import java.util.ArrayList;

public class Employe {
  private int id;
  private String nom;
  private String poste;
  private float salaire;

  // Liste statique pour stocker les employés
  private static List<Employe> employes = new ArrayList<>();

  // Create a class constructor for the Main class
  public Employe(int id, String nom, String poste, float salaire) {

    this.id = id;
    this.nom = nom;
    this.poste = poste;
    this.salaire = salaire;

  }

  // Getter
  public int getId() {
    return id;
  }

  public String getNom() {
    return nom;
  }

  public String getPoste() {
    return poste;
  }

  public float getSalaire() {
    return salaire;
  }

  // Setter
  public void setId(int id) {
    this.id = id;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setPoste(String poste) {
    this.poste = poste;
  }

  public void setSalaire(float salaire) {
    this.salaire = salaire;
  }

  // Méthode pour afficher tous les employés

  public static void afficherEmployes() {

    for (Employe e : employes) {
      System.out.println(
          "ID: " + e.getId() + ", Nom: " + e.getNom() + ", Poste: " + e.getPoste() + ", Salaire: " + e.getSalaire());
    }
  }

  // Méthode pour afficher un employé par ID
  public static void afficherEmployeParId(int id) {
    for (Employe e : employes) {
      if (e.getId() == id) {
        System.out.println(
            "ID: " + e.getId() + ", Nom: " + e.getNom() + ", Poste: " + e.getPoste() + ", Salaire: " + e.getSalaire());
        return;
      }
    }
    System.out.println("Employé avec ID " + id + " non trouvé.");
  }

  // Méthode pour ajouter un employé
  public static void ajouterEmploye(int id, String nom, String poste, float salaire) {

    employes.add(new Employe(id, nom, poste, salaire));
  }

  // Méthode pour supprimer un employé par ID

  public static void supprimerEmploye(int id) {
    employes.removeIf(e -> e.getId() == id);
  }

  // Méthode pour mettre à jour un employé
  public static void mettreAJourEmploye(int id, String nom, String poste, float salaire) {
    for (Employe e : employes) {
      if (e.getId() == id) {
        e.setNom(nom);
        e.setPoste(poste);
        e.setSalaire(salaire);
        return;
      }
    }
    System.out.println("Employé avec ID " + id + " non trouvé.");
  }

}