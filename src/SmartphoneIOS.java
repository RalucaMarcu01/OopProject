public class SmartphoneIOS extends Smartphone{
    public SmartphoneIOS(double pret, String marca){
        super(pret,marca);
    }
    @Override
    void porneste() {
        System.out.println("Telefonul IOS porneste");
    }

    @Override
    void seOpreste() {
        System.out.println("Telefonul IOS se opreste");
    }

    public void afiseazaMarca(){
        System.out.println("marca telefonului este "+super.marca);
    }
}
