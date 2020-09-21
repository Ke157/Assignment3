/**
 * @program: homework_assignment_3
 * @filename: Customer
 * @author:Ke Chen
 * @date: 2020/9/20
 * @description:
 **/
public class Customer extends Person {
    private int customerID;
    private String paymentPreference;

    public Customer(String firstName, String lastName, Address address, int customerID) {
        super(firstName, lastName, address);
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getPaymentPreference() {
        return paymentPreference;
    }

    public void setPaymentPreference(String paymentPreference) {
        this.paymentPreference = paymentPreference;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAddress() +
                ", ssn='" + getSsn() + '\'' +
                ", address=" + getAddress() +
                ", customerID=" + customerID +
                ", paymentPreference='" + paymentPreference + '\'' +
                '}';
    }

    public void introduce() {
        System.out.println(this.toString());
    }

    public void makePayment() {
        System.out.println(paymentPreference);
    }
}