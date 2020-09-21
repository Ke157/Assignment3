
/**
 * @program: homework_assignment_3
 * @filename: BusinessTest
 * @author:Ke Chen
 * @date: 2020/9/20
 * @description:
 **/
public class BusinessTest {
    public static void main(String[] args) {
        Address executiveAddress1 = new Address(1, "Xin Hua Road", "New Your", "510000", "Arkansas");
        Address executiveAddress2 = new Address(2, "Zhong Shan Road", "Guangzhou", "512012", "Colorado");
        Executive executive1 = new Executive("Tom", "Caspar", executiveAddress1, 1.0, 2.0);
        executive1.setEducationLevel("undergraduate");
        executive1.setId(0);
        executive1.setAge(20);
        executive1.setSsn("ssn0");
        executive1.introduce(true);
        executive1.setSsn("1234");
        System.out.println("executive1 compute pay:" + executive1.computePay());
        System.out.println();

        Executive executive2 = new Executive("Rose", "Jack", executiveAddress2, 2.0, 3.0);
        executive2.setEducationLevel("master");
        executive2.setId(1);
        executive2.setAge(30);
        executive2.setSsn("ssn1");
        executive2.setSsn("4312");
        executive2.introduce(false);
        System.out.println("executive2 compute pay:" + executive2.computePay());
        System.out.println();

        Address fullTimeSalariedAddress1 = new Address(1, "Xin Hua Road", "New Your", "510000", "Arkansas");
        Address fullTimeSalariedAddress2 = new Address(2, "Zhong Shan Road", "Guangzhou", "512012", "Colorado");
        FullTimeSalaried fullTimeSalaried1 = new FullTimeSalaried("Charles", "Evan", fullTimeSalariedAddress1, 4.0);
        fullTimeSalaried1.setEducationLevel("undergraduate");
        fullTimeSalaried1.setId(1);
        fullTimeSalaried1.setAge(20);
        fullTimeSalaried1.setSsn("ssn1");
        fullTimeSalaried1.setSsn("4312");
        fullTimeSalaried1.introduce(false);
        System.out.println("fullTimeSalaried1 compute pay:" + fullTimeSalaried1.computePay(3));
        System.out.println();

        FullTimeSalaried fullTimeSalaried2 = new FullTimeSalaried("Alfred", "Christian", fullTimeSalariedAddress2, 20.0);
        fullTimeSalaried2.setId(2);
        fullTimeSalaried2.setAge(30);
        fullTimeSalaried2.setEducationLevel("master");
        fullTimeSalaried2.setSsn("ssn2");
        fullTimeSalaried2.setSsn("1234");
        fullTimeSalaried2.introduce(true);
        System.out.println("fullTimeSalaried2 compute pay:" + fullTimeSalaried2.computePay(4));
        System.out.println();

        Address fullTimeHourlyAddress1 = new Address(1, "Xin Hua Road", "New Your", "510000", "Arkansas");
        Address fullTimeHourlyAddress2 = new Address(2, "Zhong Shan Road", "Guangzhou", "512012", "Colorado");
        FullTimeHourly fullTimeHourly1 = new FullTimeHourly("Charles", "Evan", fullTimeHourlyAddress1, 0, 2.0, 3.0);
        FullTimeHourly fullTimeHourly2 = new FullTimeHourly("Alfred", "Christian", fullTimeHourlyAddress2, 1, 4.0, 5.0);
        fullTimeHourly1.setEducationLevel("undergraduate");
        fullTimeHourly1.setId(1);
        fullTimeHourly1.setAge(20);
        fullTimeHourly1.setSsn("ssn1");
        fullTimeHourly1.setSsn("4312");
        fullTimeHourly1.introduce(false);
        System.out.println("fullTimeHourly1 compute pay:" + fullTimeHourly1.computePay(3));
        System.out.println();

        fullTimeHourly2.setId(2);
        fullTimeHourly2.setEducationLevel("master");
        fullTimeHourly2.setSsn("ssn2");
        fullTimeHourly2.setAge(30);
        fullTimeHourly2.setSsn("1234");
        fullTimeHourly2.introduce(true);
        System.out.println("fullTimeHourly2 compute pay:" + fullTimeHourly2.computePay(4));
        System.out.println();


        Address address1 = new Address(1, "Xin Hua Road", "New Your", "510000", "Arkansas");
        Address address2 = new Address(2, "Zhong Shan Road", "Guangzhou", "512012", "Colorado");
        PartTimeHourly partTimeHourly1 = new PartTimeHourly("Alfred", "Christian", address1, 2.0);
        PartTimeHourly partTimeHourly2 = new PartTimeHourly("Charles", "Evan", address2, 3.0);
        partTimeHourly1.setEducationLevel("undergraduate");
        partTimeHourly1.setId(1);
        partTimeHourly1.setAge(20);
        partTimeHourly1.setSsn("ssn1");
        partTimeHourly1.setSsn("4312");
        partTimeHourly1.introduce(false);
        System.out.println("partTimeHourly1 compute pay:" + partTimeHourly1.computePay(3));
        System.out.println();

        partTimeHourly2.setId(2);
        partTimeHourly2.setEducationLevel("master");
        partTimeHourly2.setSsn("ssn2");
        partTimeHourly2.setAge(30);
        partTimeHourly2.setSsn("1234");
        partTimeHourly2.introduce(true);
        System.out.println("partTimeHourly2 compute pay:" + partTimeHourly2.computePay(4));
        System.out.println();


        Contractor contractor1 = new Contractor("Alfred", "Christian", address1, 2.0, 1);
        Contractor contractor2 = new Contractor("Charles", "Evan", address2, 3.0, 2);
        contractor1.setEducationLevel("undergraduate");
        contractor1.setId(1);
        contractor1.setAge(20);
        contractor1.setSsn("ssn1");
        contractor1.setSsn("4312");
        contractor1.introduce(false);
        System.out.println("contractor1 compute pay:" + contractor1.computePay(3));
        System.out.println();

        contractor2.setId(2);
        contractor2.setEducationLevel("master");
        contractor2.setSsn("ssn2");
        contractor2.setAge(30);
        contractor2.setSsn("1234");
        contractor2.introduce(true);
        System.out.println("contractor2 compute pay:" + contractor2.computePay(4));
        System.out.println();


        Customer customer1 = new Customer("Alfred", "Christian", address1, 1);
        Customer customer2 = new Customer("Charles", "Evan", address2, 2);
        customer1.setAge(20);
        customer1.setSsn("ssn1");
        customer1.setPaymentPreference("credit card");
        customer1.setSsn("4312");
        customer1.introduce();
        customer1.makePayment();
        System.out.println();

        customer2.setSsn("ssn2");
        customer2.setAge(30);
        customer2.setPaymentPreference("cash");
        customer2.setSsn("1234");
        customer2.introduce();
        customer2.makePayment();
        System.out.println();


    }
}