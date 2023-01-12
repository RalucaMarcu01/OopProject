public class  Smartphone extends Device{
    private String marca="no name";

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
