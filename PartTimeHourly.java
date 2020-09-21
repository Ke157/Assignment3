/**
 * @program: homework_assignment_3
 * @filename: PartTimeHourly
 * @author:
 * @date: 2020/9/20
 * @description:
 **/
public class PartTimeHourly extends Employee {
    private Double baseHourlyPay;

    public PartTimeHourly() {
        super();
    }

    public PartTimeHourly(String firstName, String lastName, Address address) {
        super(firstName, lastName, address, 0);
    }

    public PartTimeHourly(String firstName, String lastName, Address address, Double baseHourlyPay) {
        super(firstName, lastName, address, 0);
        this.baseHourlyPay = baseHourlyPay;
    }

    public Double getBaseHourlyPay() {
        return baseHourlyPay;
    }

    public void setBaseHourlyPay(Double baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }

    @Override
    public String toString() {
        return "PartTimeHourly{" +
                "id=" + getId() +
                ", educationLevel='" + getEducationLevel() + '\'' +
                ", directDeposit=" + isDirectDeposit() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", ssn='" + getSsn() + '\'' +
                ", address=" + getAddress() +
                ", baseHourlyPay=" + baseHourlyPay +
                '}';
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println(this.toString());
        } else {
            System.out.println("PartTimeHourly{" +
                    "id=" + getId() +
                    ", educationLevel='" + getEducationLevel() + '\'' +
                    ", directDeposit=" + isDirectDeposit() +
                    ", firstName='" + getFirstName() + '\'' +
                    ", lastName='" + getLastName() + '\'' +
                    ", age=" + getAge() +
                    ", address=" + getAddress() +
                    ", baseHourlyPay=" + baseHourlyPay +
                    '}');
        }
    }

    public Double computePay(int numHrs) {
        if (numHrs > 40) {
            return -1.0;
        }
        return baseHourlyPay * numHrs;
    }
}
