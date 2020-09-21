/**
 * @program: homework_assignment_3
 * @filename: Executive
 * @author:Ke Chen
 * @date: 2020/9/20
 * @description:
 **/
public class Executive extends Employee {
    private Double yearlyBonus;
    private Double yearlyCompensation;

    public Executive() {
        super();
    }

    public Executive(String firstName, String lastName, Address address, Double yearlyBonus, Double yearlyCompensation) {
        super(firstName, lastName, address, 0);
        this.yearlyBonus = yearlyBonus;
        this.yearlyCompensation = yearlyCompensation;
    }

    public Double getBonus() {
        return yearlyBonus;
    }

    public void setBonus(Double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    @Override
    public String toString() {
        return "Executive{" +
                "yearlyBonus=" + yearlyBonus +
                ", yearlyCompensation=" + yearlyCompensation +
                '}';
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println("Executive{" +
                    "id=" + getId() +
                    ", educationLevel='" + getEducationLevel() + '\'' +
                    ", directDeposit=" + isDirectDeposit() +
                    ", firstName='" + getFirstName() + '\'' +
                    ", lastName='" + getLastName() + '\'' +
                    ", age=" + getAge() +
                    ", ssn='" + getSsn() + '\'' +
                    ", address=" + getAddress() +
                    ", yearlyBonus=" + yearlyBonus +
                    ", yearlyCompensation=" + yearlyCompensation +
                    '}');
        } else {
            System.out.println("Executive{" +
                    "id=" + getId() +
                    ", educationLevel='" + getEducationLevel() + '\'' +
                    ", directDeposit=" + isDirectDeposit() +
                    ", firstName='" + getFirstName() + '\'' +
                    ", lastName='" + getLastName() + '\'' +
                    ", age=" + getAge() +
                    ", address=" + getAddress() +
                    ", yearlyBonus=" + yearlyBonus +
                    ", yearlyCompensation=" + yearlyCompensation +
                    '}');
        }
    }


    public Double computePay() {
        return yearlyBonus + yearlyCompensation;
    }
}