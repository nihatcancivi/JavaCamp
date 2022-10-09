public class Main {
    public static void main(String[] args) {
        //referans tiplerin biribirinin
        // refareasını tutması itibariyle(birbirini
        // inherit etmesi gerekiyor)  olan durum.
//classlardanda dizi oluşturulabilir.
      BaseLogger[] loggers =new BaseLogger[]{new FileLogger(),new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
      //aslında bunlar hepsi baselogger oyüzden verebiliyruz paramtre oalrak.

    /* for(BaseLogger logger : loggers){
         logger.Log("Log Meajı");

     }*/

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}