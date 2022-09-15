import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Stringler karaktrer dizisidir.
        String mesaj = ("Bugün hava çok güzel!");

        System.out.println(mesaj.length());//eleman sayısı
        System.out.println(mesaj.charAt(4));//5. eleman
        System.out.println(mesaj.concat("Yaşasın!"));//birleştirmek
        System.out.println(mesaj.startsWith("B"));//neyle başlıyor B ile başlıyorsa true döndürür cae sensive dir
        System.out.println(mesaj.endsWith("."));//0 ile bitiyomu true false döner case sensitivedir.
        System.out.println(mesaj.indexOf("av"));// mesajın içinde kaçıncı eleman olduğunu verir.Yoksa -1 döner
//Bir dizide bir harfin yada birşeyin olup olmadığını bulmak için indexof vea lastindexof kullanabiliriz
        System.out.println(mesaj.lastIndexOf("e"));//sondan kçaıncı eleman oldpunu söyler yoka -1 döner
        //----------------------------------------
        char[] karakterler = new char[25];
        mesaj.getChars(0, 5, karakterler, 0);//dst -> destination (hedef) 0. indexinden itibaren karakterleri aktar.
        System.out.println(karakterler);


        System.out.println(mesaj.replace("", "-"));// boşlukları - ile değiştirir.
        System.out.println(mesaj.substring(2));//2.indexten itibaren alır
        System.out.println(mesaj.substring(2, 5));//2 ile 5 index arasını alır 5 dahil değil

        for (String kelime : mesaj.split(" ")) {//kelimeleri boşluklara göre ayırıp diziye atadık
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());//hepsini küçültür.arama ifadesini dbde tamamen küçültmek isteyebilirz.
        System.out.println(mesaj.toUpperCase());//hepsini büyültür.
        System.out.println(mesaj.trim());//başındaki ve sonundak boşlukları atar.
    }
}