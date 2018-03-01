package md.tekwill;

public class Employee {
    private static Employer employer;

    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFullName(String firstName, String lastName){
        this.firstName  = firstName;
        this.lastName   = lastName;
    }


    public void setFullName(String fullName){
        this.firstName  = fullName.split(" ")[0];
        this.lastName   = fullName.split(" ")[1];
    }

    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String fullName){
        this.firstName  = fullName.split(" ")[0];
        this.lastName   = fullName.split(" ")[1];
    }

    public static void setEmployer(Employer newEmployer){
        employer = newEmployer;
    }

    public static Employer getEmployer(){
        return employer;
    }

    @Override

    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
