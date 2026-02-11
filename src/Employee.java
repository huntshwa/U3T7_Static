public class Employee {
    private static int mostRecentEmployeeID = 99;
    private static int totalEmployeesCreated;
    private String firstName;
    private String lastName;
    private int employeeIDNumber;

    public Employee() {
        firstName = null;
        lastName = null;
        totalEmployeesCreated++;
        mostRecentEmployeeID++;
        employeeIDNumber = mostRecentEmployeeID;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        totalEmployeesCreated++;
        mostRecentEmployeeID++;
        employeeIDNumber = mostRecentEmployeeID;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getID() {
        return employeeIDNumber;
    }

    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }

    public String employeeInfo() {
        return "Employee full name: " + getFullName()
                + "\nEmployee ID: " + employeeIDNumber
                + "\nMost recent ID assigned: " + mostRecentEmployeeID
                + "\nTotal employees hired: " + totalEmployeesCreated;
    }


}
