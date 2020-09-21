/**
 * @program: homework_assignment_3
 * @filename: FullTimeEmployee
 * @author:
 * @date: 2020/9/20
 * @description:
 **/
public abstract class FullTimeEmployee extends Employee {
    private Double basePay;

    public FullTimeEmployee() {
        super();
    }

    public FullTimeEmployee(String firstName, String lastName, Address address, int id) {
        super(firstName, lastName, address, id);
    }

    public FullTimeEmployee(String firstName, String lastName, Address address, int id, Double basePay) {
        super(firstName, lastName, address, id);
        this.basePay = basePay;
    }

    public Double getBasePay() {
        return basePay;
    }

    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "id=" + getId() +
                ", educationLevel='" + getEducationLevel() + '\'' +
                ", directDeposit=" + isDirectDeposit() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", ssn='" + getSsn() + '\'' +
                ", address=" + getAddress() +
                ", basePay=" + basePay +
                '}';
    }
}
