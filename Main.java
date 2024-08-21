import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // Ajouter un Employés
    Employe.ajouterEmploye(1, "Alice", "Ingénieur", 3000.000f);
    Employe.ajouterEmploye(2, "Bob", "Technicien", 2000.000f);
    // Afficher tous les employés
    System.out.println("Affichage de tous les employés :");
    Employe.afficherEmployes();

    // Demander à l'utilisateur d'entrer un ID d'employé pour afficher ses détails
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez l'ID de l'employé pour afficher ses détails : ");
    int idRechercher = scanner.nextInt();
    Employe.afficherEmployeParId(idRechercher);

    // Ajouter un nouvel employé
    Employe.ajouterEmploye(3, "Charlie", "Assistant", 2500.00f);
    System.out.println("Affichage après ajout :");
    Employe.afficherEmployes();

    // Supprimer un employé par ID
    System.out.println("Entrez l'ID de l'employé à supprimer : ");
    int idASupprimer = scanner.nextInt();
    Employe.supprimerEmploye(idASupprimer);
    System.out.println("Affichage après suppresion : ");
    Employe.afficherEmployes();

    // Mettre à jour un employé
    System.out.println("Entrez l'ID de l'employé à mettre à jour : ");
    int idAMettreAJour = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Entrez le nouveau nom : ");
    String nouveauNom = scanner.nextLine();
    System.out.println("Entrez le nouveau poste : ");
    String nouveauPoste = scanner.nextLine();
    System.out.println("Entrez le nouveau salaire : ");
    float nouveauSalaire = scanner.nextFloat();
    Employe.mettreAJourEmploye(idAMettreAJour, nouveauNom, nouveauPoste, nouveauSalaire);
    System.out.println("Affichage après mise à jour : ");
    Employe.afficherEmployes();
    // Fermer le scanner
    scanner.close();
  }

}