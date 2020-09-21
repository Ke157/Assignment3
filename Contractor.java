/**
 * @program: homework_assignment_3
 * @filename: Contractor
 * @author:Ke Chen
 * @date: 2020/9/20
 * @description:
 **/
public class Contractor extends Employee {
    private Double basePay;

    public Contractor() {
        super();

    }

    public Contractor(String firstName, String lastName, Address address, Double basePay, int id) {
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
        return "Contractor{" +
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

    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println(this.toString());
        } else {
            System.out.println("Contractor{" +
                    "id=" + getId() +
                    ", educationLevel='" + getEducationLevel() + '\'' +
                    ", directDeposit=" + isDirectDeposit() +
                    ", firstName='" + getFirstName() + '\'' +
                    ", lastName='" + getLastName() + '\'' +
                    ", age=" + getAge() +
                    ", address=" + getAddress() +
                    ", basePay=" + basePay +
                    '}');
        }
    }

    public Double computePay(int numHrs) {
        return basePay * numHrs;
    }
}