public class Main {
    
 public static void main(String[] args) { 
  // Instancier à l'exterieur de la class && lancer le constructeur
    Employe monEmployer = new Employe();
       System.out.println(monEmployer.getId());
       System.out.println(monEmployer.getNom());
       System.out.println(monEmployer.getPoste());
       System.out.println(monEmployer.getSalaire());
       //   monEmployer.setName("Merco");

       // Appel des methodes 
      monEmployer.getAllEmployer();
      monEmployer.getEmployerById();
      monEmployer.addEmployer();
      monEmployer.DeletedEmployer();
      monEmployer.UpdateEmployer();

 }

}