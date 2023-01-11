public class Film {
    private String titlu;
    int anProductie;
    double rating;
    boolean portivitPtCopii;

    public static String unText="Toate filmele sunt frumoase";



    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Film(){
        this.titlu="unknown";
        this.anProductie=2000;
        this.rating=10;
        this.portivitPtCopii=false;
        System.out.println("Primul constructor este apelat");
    }
    public Film(String titlu, int anProductie, boolean portivitPtCopii) {
        this.titlu = titlu;
        this.anProductie = anProductie;
        this.portivitPtCopii = portivitPtCopii;
    }
    public  void afiseazaDacaEPotrivitPtCopii()
    {
        if(this.portivitPtCopii)
            System.out.println(this.titlu+ " potrivit pentru copii");
        else
            System.out.println(this.titlu+" nu e potrivit pentru copii");

    }

    public String afiseazaRating(){
        return (this.titlu+" are rating "+ this.rating);
    }

    public static String afiseazaUnText(){
        return(unText);
    }



}
