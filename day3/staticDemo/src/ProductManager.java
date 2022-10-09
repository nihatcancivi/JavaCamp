public class ProductManager {
    public void add(Product product){
        //veritabanına gönderecek
        ProductValidator productValidator = new ProductValidator();
        if(productValidator.isValid(product)){
            System.out.println("Veritabanina eklendi");
        }else{
            System.out.println("Geçersiz");
        }

    }
}
