public class Main {
    public static void main(String[] args) {
        int sayi = 15;
        //defensive programming her durum için şartları kontrol etmek.
        if(sayi>10){
            System.out.println("sayi 10dan aa");
        }else if(sayi==10){
            System.out.println("sayi 10dan bb");
        }else{
            System.out.println("Sayi küçüktür cc");
        }


    }
}
