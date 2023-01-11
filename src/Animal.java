public class Animal {

    String nume;
    String culoare;
    Boolean vegetarian;
    int nrPicioare;
    private String undeTraieste;

    public String getUndeTraieste() {
        return undeTraieste;
    }

    public void setUndeTraieste(String undeTraieste) {
        this.undeTraieste = undeTraieste;
    }

    public Animal() {
        nume="unknwon";
        culoare="unknown";
        vegetarian=false;
    }

    public Animal(String nume, int nrPicioare) {
        this.nume = nume;
        this.nrPicioare = nrPicioare;
    }

    public Animal(String culoare) {
        this.culoare = culoare;
    }

    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    public Animal(String nume, String culoare, Boolean vegetarian) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
    }


    public void mananca(){
        System.out.println(this.nume+" mananca");
    }

    public void doarme(){
        System.out.println(this.nume+" doarme");
    }

    public  String afiseaza(){
        String afis=this.nume+" are culoarea "+ this.culoare;
        return afis ;
    }

    public void afiseazaPicioare(){
        if(this.nrPicioare==0)
            System.out.println("nu are pcioare");
        else if (this.nrPicioare==2) {
            System.out.println("are 2 picioare");
        } else if (this.nrPicioare==4) {
            System.out.println("are 4 picioare");
        }
        else
            System.out.println("are alt numar de picioare");
    }

    public void mediuDeViata(){
        if(this.nrPicioare>4)
            System.out.println("in apa");
        else
            System.out.println("pe uscat");
    }
}
