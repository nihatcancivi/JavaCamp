public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number = 2;
        //bir ve kendinden başka pozitif böleni olmayan.
        int remainder;
        //System.out.println(remainder);
        boolean isPrime = true;//asalmi anlamında inglizce

        //defensive programming
        if(number==1){
            System.out.println("1 Asal sayi değildir");
            return;//gerisini işletmez. main fonksiyonunu bitirir.
        }
        if (number < 1) {
            System.out.println("Geçersiz sayi");
        }

        for(int i =2 ; i<number ; i++){
            remainder = number % i;
            if(remainder ==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println(number+"Asal sayidir.");
        }else {
            System.out.println(number+"Asal sayi değildir");
        }



    }
}