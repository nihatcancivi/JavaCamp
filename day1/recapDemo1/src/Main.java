public class Main {
    public static void main(String[] args) {
        int sayi1 = 78 ;
        int sayi2 = 100;
        int sayi3 = 30;
        int enBuyuk = sayi1;

        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
        }if (enBuyuk<sayi3){
            enBuyuk=sayi3;
        }


        System.out.println("En büyük " + enBuyuk);


        System.out.println("Hello world!");
    }
}