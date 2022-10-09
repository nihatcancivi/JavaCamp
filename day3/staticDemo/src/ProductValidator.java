public class ProductValidator {
    //bir ürünü kayderken güncellerken , kurallara uygunluğu için kullanırız.
    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public void birsey(){//bu static değil bunu çağırabilmek için programVCaldatoru newlemek lazım
        //satic yaparsak ProductValidator. yaparak ulaşabiliriz
        //yoksa newlememiz gerkir.
        //constructorlar newleyince çalışır


    }
}
