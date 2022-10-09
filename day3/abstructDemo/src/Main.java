public class Main {
    //Müşteriyi veritabanına kaydferkern fakrlı teknikler veya farlı veri tabanlarıyla çalışıyo oalbiliriz.
    //Mysql mssql vs gibi.
    //Hepsinin kodu farklıdır.
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new SqlServerDatabseManager();
        customerManager.getCustomer();
    }
}