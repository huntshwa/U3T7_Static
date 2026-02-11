public class Main {
    public static void main(String[] args) {
//        Rectangle rect1 = new Rectangle(5, 6);
//        boolean square = rect1.isSquare();
//        System.out.println(square);
//        System.out.println(RaceUtility.milesToKm(13.85));
//        System.out.println(RaceUtility.milesToKm(26.42));
//        System.out.println(RaceUtility.kmToMiles(40));
//        System.out.println(RaceUtility.kmToMiles(3.5));
//        System.out.println(RaceUtility.makeProper("welcome to the marathon!"));
//        System.out.println(RaceUtility.makeProper("It's TIME for THE 5k!"));

        Employee employee1 = new Employee("Jim", "Mason");
        System.out.println(employee1.employeeInfo());
        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());

        Employee employee2 = new Employee("Amy", "Adams");
        System.out.println(employee2.employeeInfo());
        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());

        System.out.println(employee1.employeeInfo());
        System.out.println(employee2.employeeInfo());

        Employee employee3 = new Employee("Bob", "Ross");
        System.out.println(employee3.employeeInfo());

        Employee employee4 = new Employee("Cindy", "Nox");
        System.out.println(employee4.employeeInfo());

        System.out.println(employee1.employeeInfo());
        System.out.println(employee2.employeeInfo());
        System.out.println(employee3.employeeInfo());
        System.out.println(employee4.employeeInfo());

        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());



    }
}
