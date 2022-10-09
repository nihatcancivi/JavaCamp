public class CustomerManager {
    //İş kodları yazılır diğer yerdeki add i kullanmamalıyız.
    //Müşterinin adı girilmişmi doğrumu veriler doğrum uvs gibi iş kodları burdadır.
    private ICutomerDal customerDal;

    public CustomerManager(ICutomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add(){
        customerDal.Add();

    }
}
