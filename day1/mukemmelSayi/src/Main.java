public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Kendinen başka tüm tam bölenlerinin sayısı toplamı kendine eşit
        //örn : 6 //1 , 2 ve  3e bölünür toplamı 6 dır.
        //28 : 1,2,4,7,14
        int number = 28;
        int sum =0;

        for(int i =1 ; i<number ; i++){
            if(number % i ==0){
                sum+= i;
            }
        }

        if(number == sum){
            System.out.println("Mükemmel sayidir" + number);
        }else {
            System.out.println("Mükemmel değildir.");
        }
    }
}