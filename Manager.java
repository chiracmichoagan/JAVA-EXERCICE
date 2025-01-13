// Manager.java
public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(int id, String name, double salary, int numberOfSubordinates) {
        super(id, name, "Manager", salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public String getSpecialization() {
        return "Managing " + numberOfSubordinates + " employees";
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Subordinates: " + numberOfSubordinates;
    }
}