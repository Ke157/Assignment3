/**
 * @program: homework_assignment_2
 * @filename: Employee
 * @author:
 * @date: 2020/9/11
 * @description:
 **/
public abstract class Employee extends Person {
    private int id;
    private String educationLevel;
    private boolean directDeposit;

    public Employee() {
        super("", "", null);
    }

    public Employee(String firstName, String lastName, Address address, int id) {
        super(firstName, lastName, address);
        this.id = id;
        this.educationLevel = "";
        this.directDeposit = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public boolean isDirectDeposit() {
        return directDeposit;
    }

    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", educationLevel='" + educationLevel + '\'' +
                ", directDeposit=" + directDeposit +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", ssn='" + getSsn() + '\'' +
                ", address=" + getAddress() +
                '}';
    }
}


