package md.tekwill;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        // TASK 1: Implement necessary methods
        // employee1.setFirstName("Bill");
        // employee1.setLastName("Gates");

        // employee2.setFirstName("Steve");
        // employee2.setLastName("Jobs");

        System.out.println(employee1);
        System.out.println(employee2);

        // TASK 2: Implement method which receives 2 arguments
        // First argument - firstName, second argument - lastName
        // employee1.setFullName("Steve", "Wozniak");
        // employee2.setFullName("Ronald", "Wayne");

        System.out.println(employee1);
        System.out.println(employee2);

        // TASK 3: Overload method setFullName - now also can receive one argument
        // Split argument by space in two, first word assign to firstName,
        // second - assign to lastName
        // employee1.setFullName("Tom Hanks");
        // employee2.setFullName("Johnny Depp");

        System.out.println(employee1);
        System.out.println(employee2);

        // TASK 4: Create a constructor that takes 2 arguments,
        // firstName and lastName.
        //employee1 = new Employee("Matt", "Damon");
        //employee2 = new Employee("Michael", "Caine");

        System.out.println(employee1);
        System.out.println(employee2);

        // TASK 5: Create a constructor that takes 1 argument,
        // gets as input the full name, splits by space and assign the values to
        // fistName and lastName
        //employee1 = new Employee("Leonardo DiCaprio");
        //employee2 = new Employee("Denzel Washington");

        System.out.println(employee1);
        System.out.println(employee2);

        // TASK 6: Create a static method to set the static
        // field employer and another method to get the employer
        Employer employer = new Employer("Steven Spielberg");
        //Employee.setEmployer(employer);
        //System.out.println(employee1.getEmployer());
        //System.out.println(employee2.getEmployer());

        // TASK 7: Overload setAge method that would take a String argument
        employer.setAge(70);
        //employer.setAge("71");
        System.out.println(employer);
    }
}
