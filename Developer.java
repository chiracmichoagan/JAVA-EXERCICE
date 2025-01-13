// Developer.java
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, "Developer", salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getSpecialization() {
        return "Specialized in " + programmingLanguage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Programming Language: " + programmingLanguage;
    }
}