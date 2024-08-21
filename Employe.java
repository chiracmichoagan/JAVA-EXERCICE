import java.util.Scanner;
public class Employe {

    private Employe[] Employe = {
        new Employe(id:Date.now(), nom:"Chirac",poste:"Formateur",salaire:500),
        new Employe(id:Date.now(), nom:"Chirac",poste:"Formateur",salaire:500)
    };



    // Create a class constructor for the Main class
  public Employe() {
  System.out.println("Mon constructeur");  // Set the initial value for the class attribute x
  }
  
  // Getter
  public String getId() {
    return id                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ;
  }
  public String getNom() {
    return nom;
  }
  public String getPoste() {
    return poste;
  }
  public String getSalaire() {
    return salaire;
  }

   // Setter
   public void getId(String newId) {
    this.id = newId; }
   public void getNom(String newNom) {
    this.nom = newNom; }
  public void getPoste(String newPoste) {
    this.poste = newPoste; }
   public void getSalaire(String newSalaire) {
  this.salaire = newSalaire; }

 public static void getAllEmployer(){
       System.out.println();
    }
 public static void getEmployerById(){
       System.out.println();
    }
 public static void addEmployer(){
        
      for (int i : Employe) {
         Employe.add(i);
        }

       System.out.println();
    }
 public static void DeletedEmployer(){
       System.out.println();
    }
 public static void UpdateEmployer(){
       System.out.println();
    }

  // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un nombre
        System.out.print("Entrez le nom de l'employer que vous recherchez ? ");
        String nomRechercher = scanner.nextInt();

        // Utiliser Arrays.binarySearch() pour rechercher le nom dans le tableau
        String nom = Arrays.binarySearch(Employe, nomRechercher);

        // Afficher le résultat de la recherche
        if (nom >= 0) {
            System.out.println("Index: " + nom);
        } else {
            System.out.println("L'élément n'est pas présent dans le tableau.");
        }

        // Fermer le scanner
        scanner.close();
}