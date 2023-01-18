public class  Smartphone extends Device{
    protected double pret;
    protected String marca="no name";

    public Smartphone(double pret, String marca) {
        this.pret = pret;
        this.marca = marca;
    }

    //    public String getMarca() {
//        return marca;
//    }
//
   public void setMarca(String marca) {
        this.marca = marca; }

    @Override
    void porneste() {
        System.out.println("Telefonul porneste");
    }

    @Override
    void seOpreste() {
        System.out.println("Telefonul se opreste");
    }
}
