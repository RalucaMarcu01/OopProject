public class Persoana {
    String nume;
    String prenume;
    int varsta;
    String gen;

    public Persoana(int varsta) {
        this.varsta = varsta;
    }

    Persoana(){
        gen="m";
        nume="unknown";
        prenume="unknown";
        varsta=1;

    }

    public Persoana(String nume, String prenume, int varsta, String gen) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
    }

    Persoana(String nume, String prenume){
        // this se refera la atributul din clasa curenta
       this.nume= nume;
       this.prenume= prenume;

    }
}
