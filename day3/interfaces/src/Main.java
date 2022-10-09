public class Main {
    public static void main(String[] args) {
        //polymorphism

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());

        customerManager.add();


    }
}