/**
 * @program: homework_assignment_3
 * @filename: FullTimeHourly
 * @author:
 * @date: 2020/9/20
 * @description:
 **/
public class FullTimeHourly extends FullTimeEmployee {
    private Double overtimePay;

    public FullTimeHourly(String firstName, String lastName, Address address, int id) {
        super(firstName, lastName, address, id);
    }

    public FullTimeHourly(String firstName, String lastName, Address address, int id, Double basePay, Double overtimePay) {
        super(firstName, lastName, address, id, basePay);
        this.overtimePay = overtimePay;
    }

    public Double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(Double overtimePay) {
        this.overtimePay = overtimePay;
    }

    @Override
    public String toString() {
        return "FullTimeHourly{" +
                "id=" + getId() +
                ", educationLevel='" + getEducationLevel() + '\'' +
                ", directDeposit=" + isDirectDeposit() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", ssn='" + getSsn() + '\'' +
                ", address=" + getAddress() +
                ", overtimePay=" + overtimePay +
                '}';
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println(this.toString());
        } else {
            System.out.println("FullTimeHourly{" +
                    "id=" + getId() +
                    ", educationLevel='" + getEducationLevel() + '\'' +
                    ", directDeposit=" + isDirectDeposit() +
                    ", firstName='" + getFirstName() + '\'' +
                    ", lastName='" + getLastName() + '\'' +
                    ", age=" + getAge() +
                    ", address=" + getAddress() +
                    ", overtimePay=" + overtimePay +
                    '}');
        }
    }

    public Double computePay(int numHrs) {
        if (numHrs > 100) {
            return getBasePay() * 100 + overtimePay * (numHrs - 100);
        }
        return getBasePay() * numHrs;

    }

}
