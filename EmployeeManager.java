// EmployeeManager.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager implements EmployeeOperations {
    private List<Employee> employees = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    @Override
    public void removeEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
        System.out.println("Employee removed successfully.");
    }

    @Override
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee e : employees) {
                System.out.println(e);
                System.out.println("Specialization: " + e.getSpecialization());
            }
        }
    }

    @Override
    public void displayEmployeeById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                System.out.println(e);
                System.out.println("Specialization: " + e.getSpecialization());
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void menu() {
        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Manager");
            System.out.println("2. Add Developer");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Display Employee by ID");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consomme la ligne restante
            switch (choice) {
                case 1:
                    System.out.println("Enter Manager ID:");
                    int managerId = scanner.nextInt();
                    scanner.nextLine();  // Consomme la ligne restante
                    System.out.println("Enter Manager Name:");
                    String managerName = scanner.nextLine();
                    System.out.println("Enter Manager Salary:");
                    double managerSalary = scanner.nextDouble();
                    System.out.println("Enter Number of Subordinates:");
                    int numSubordinates = scanner.nextInt();
                    addEmployee(new Manager(managerId, managerName, managerSalary, numSubordinates));
                    break;
                case 2:
                    System.out.println("Enter Developer ID:");
                    int developerId = scanner.nextInt();
                    scanner.nextLine();  // Consomme la ligne restante
                    System.out.println("Enter Developer Name:");
                    String developerName = scanner.nextLine();
                    System.out.println("Enter Developer Salary:");
                    double developerSalary = scanner.nextDouble();
                    scanner.nextLine();  // Consomme la ligne restante
                    System.out.println("Enter Programming Language:");
                    String language = scanner.nextLine();
                    addEmployee(new Developer(developerId, developerName, developerSalary, language));
                    break;
                case 3:
                    System.out.println("Enter employee ID to remove:");
                    int idToRemove = scanner.nextInt();
                    removeEmployee(idToRemove);
                    break;
                case 4:
                    displayAllEmployees();
                    break;
                case 5:
                    System.out.println("Enter employee ID to display:");
                    int idToDisplay = scanner.nextInt();
                    displayEmployeeById(idToDisplay);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.menu();
    }
}