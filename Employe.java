public class Employe {

    private Employe[] Employe = {
        new Employe(id:Date.now(), nom:"Chirac",poste:"Formateur",salaire:500),
        new Employe(id:Date.now(), nom:"Chirac",poste:"Formateur",salaire:500)
    };

   private int ID = Date.now();
   private String nom = "";
   private  String poste;
   private int salaire;

    // Create a class constructor for the Main class
  public Employe() {
  System.out.println("Mon constructeur");  // Set the initial value for the class attribute x
  }
  
  // Getter
  public String getId() {
    return ID;
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
    this.type = newId; }
   public void getNom(String newNom) {
    this.type = newNom; }
  public void getPoste(String newPoste) {
    this.type = newPoste; }
   public void getSalaire(String newSalaire) {
  this.type = newSalaire; }

 public static void getAllEmployer(){
       System.out.println();
    }
 public static void getEmployerById(){
       System.out.println();
    }
 public static void addEmployer(){
       System.out.println();
    }
 public static void DeletedEmployer(){
       System.out.println();
    }
 public static void UpdateEmployer(){
       System.out.println();
    }

}