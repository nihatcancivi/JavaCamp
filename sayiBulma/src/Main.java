public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 11;

        boolean bulunduMu = false;

        for (int sayi : sayilar) {
            if(sayi == aranacak){
                bulunduMu = true;

            }
        }
        if(bulunduMu){
            System.out.println("Sayi bulundu");
        }else {
            System.out.println("Sayi bulunamadı");
        }
    }
}