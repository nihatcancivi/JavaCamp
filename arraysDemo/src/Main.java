public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Nihat";

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";

        for (int i = 0; i < ogrenciler.length; i++)
            System.out.println(ogrenciler[i]);

        for(String ogrenci : ogrenciler){ //ogrenciler dizisindeki herbir elemanı gez ve ogrenci değişkenine ata
            System.out.println(ogrenci);
        }
    }
}