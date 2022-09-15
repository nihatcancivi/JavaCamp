public class Main {
    public static void main(String[] args) {
        //FOR

        for (int i = 0; i < 10; i++) {
            System.out.println("Nihatcim " + i + ". kez selamlar");
        }
        System.out.println("For Dongu bitti");

        //WHILE
        int i = 1;
        while (i < 10) {
            System.out.println("While ödngüsü çalışıyor" + i);
            i++;
        }
        System.out.println("While döngüsü bitti");

        //DO WHILE ---> farkı şart sağlanmasa bile bir kere çalışır
        //dbye log atılcak mesela döngü çalışıyosa log at diyebiliriz koşul sağlanmasa bile

        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
    }
}