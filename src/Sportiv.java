abstract class Sportiv {

    protected String proba;
    protected String tara;

    public Sportiv(String proba, String tara) {
        this.proba = proba;
        this.tara = tara;
    }

    abstract void seAntreneaza();

    public void seOdihneste(){
        System.out.println("sportivul se odihneste");
}}
