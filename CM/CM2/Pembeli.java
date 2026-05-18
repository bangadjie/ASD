package CM.CM2;

public class Pembeli {
    String namaPembeli, NoHp;

    public Pembeli(String namaPembeli, String NoHp){
        this.namaPembeli = namaPembeli;
        this.NoHp = NoHp;
    }

    public void tampilkanPembeli() {
        System.out.println(namaPembeli + " - " + NoHp);
    }
}
