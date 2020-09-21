/**
 * @program: homework_assignment_3
 * @filename: FullTimeSalaried
 * @author:Ke Chen
 * @date: 2020/9/20
 * @description:
 **/
public class FullTimeSalaried extends FullTimeEmployee {

    public FullTimeSalaried(String firstName, String lastName, Address address, Double salary) {
        super(firstName, lastName, address, 0);
        setBasePay(salary);
    }


    @Override
    public String toString() {
        return "FullTimeSalaried{" +
                "id=" + getId() +
                ", educationLevel='" + getEducationLevel() + '\'' +
                ", directDeposit=" + isDirectDeposit() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", ssn='" + getSsn() + '\'' +
                ", address=" + getAddress() +
                ", basePay=" + getBasePay() +
                '}';
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println(toString());
        } else {
            System.out.println("FullTimeSalaried{" +
                    "id=" + getId() +
                    ", educationLevel='" + getEducationLevel() + '\'' +
                    ", directDeposit=" + isDirectDeposit() +
                    ", firstName='" + getFirstName() + '\'' +
                    ", lastName='" + getLastName() + '\'' +
                    ", age=" + getAge() +
                    ", address=" + getAddress() +
                    ", basePay=" + getBasePay() +
                    '}');
        }

    }

    public Double computePay(int numWeeks) {
        return getBasePay() * numWeeks;
    }
}