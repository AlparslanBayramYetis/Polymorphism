package Polymorphism.beyblade;

public class beyblade {
    private String beybladeci;
    private int donushizi;
    private int saldirigucu;

    public beyblade(String beybladeci, int donushizi, int saldirigucu) {
        this.setBeybladeci(beybladeci);
        this.setDonushizi(donushizi);
        this.setSaldirigucu(saldirigucu);

    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonushizi() {
        return donushizi;
    }

    public void setDonushizi(int donushizi) {
        this.donushizi = donushizi;
    }

    public int getSaldirigucu() {
        return saldirigucu;
    }

    public void setSaldirigucu(int saldirigucu) {
        this.saldirigucu = saldirigucu;
    }
    void saldir(){
        System.out.println(getSaldirigucu() + " " + saldirigucu + " ve "+ donushizi + "ile saldırıyor");

    }
    void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu beyblade'in kutsal canavarı yoktur");
    }
    void bilgilergoster(){
        System.out.println("Beybladeci ismi : " + beybladeci);
        System.out.println("Saldırı gücü : " + saldirigucu);
        System.out.println("Dönüş hızı : "  + donushizi);
    }
}
