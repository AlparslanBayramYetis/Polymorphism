package Polymorphism;
class Hayvan{
    private String isim;

    Hayvan(String isim){
        this.setIsim(isim);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String Konus(){
        return "Hayvan Konuşuyor....";
    }


}

class Kedi extends Hayvan{
    Kedi(String isim){
        super(isim);
    }
    public String Konus() {
       // return super.Konus();
        return this.getIsim() + " miyavlıyor";
    }
}
class Kopek extends Hayvan{
    Kopek(String isim){
        super(isim);
    }
    public String Konus() {
        return this.getIsim() + " havlıyor";
    }
}
class At extends Hayvan{
    At(String isim){
        super(isim);
    }
    public String Konus() {
        return this.getIsim() + "kişniyor";
    }
}



public class Main {
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.Konus());
    }
    public static void main(String[] args) {
        Hayvan hayvan = new Kopek("Karabaş");
        System.out.println(hayvan.Konus());

        Hayvan hayvan2 = new Kedi("İrem");
        System.out.println(hayvan2.Konus());
        //eğer alt kodlarda override edilmediysen ana koddaki şeyi çağırıyor.

        konustur(new Kedi("TEKİR"));

        // İNSTANCEOF bir obje verip hangi classtan olduğunu anlıyoruz

        Kopek kopek = new Kopek("ZEYTİN");

        if (kopek instanceof Hayvan){
            System.out.println("Bu nesne Hayvan sınıfından");
        }


    }
}
