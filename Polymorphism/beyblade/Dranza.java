package Polymorphism.beyblade;

public class Dranza extends beyblade{
    private String kutsalcanavar;

    public Dranza(String beybladeci,int donushizi,int saldirihizi , String kutsalcanavar) {
        super(beybladeci,donushizi,saldirihizi);
        this.kutsalcanavar = kutsalcanavar;

    }
    void bilgilerigoster(){
        super.bilgilergoster();
        System.out.println("Kutsal canavar adı : " + kutsalcanavar);
    }
    void kutsalcanavarortayacikar(){
        System.out.println(getBeybladeci() + " "+ kutsalcanavar +" ı ortaya çıkarıyor");
        System.out.println(getBeybladeci() + "ın Saldırısı : Alev Kılıcı");
    }
}
