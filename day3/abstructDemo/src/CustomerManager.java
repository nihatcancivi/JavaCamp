public class CustomerManager {
    //strategy pattern

    BaseDatabaseManager databaseManager;


    public void getCustomer(){
        databaseManager.getData();

    }

}
