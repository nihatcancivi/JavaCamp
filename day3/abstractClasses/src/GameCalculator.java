public abstract class GameCalculator {
    public abstract void hesapla();
    //kim gamecalculatoru kullanıyorsa hesaplayı içermek zorunda
    //fakat hesapalyı override etmek zorunda yani kendi oluşturmak zorunda
    public final void hesagameOverpla(){
        System.out.println("Oyun bitti");
    }
}
