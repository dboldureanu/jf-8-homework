package md.tekwill;

public class Employee {
    private static Employer employer;

    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
