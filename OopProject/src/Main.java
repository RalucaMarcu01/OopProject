import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Book book1= new Book();

        System.out.println(book1.showAuthorAndTitle());

        //creeaza un obiect nou din clasa Oop
        Oop object1=new Oop();
        Oop object2=new Oop();
        System.out.println(object1.x);
        object2.x=10;
        System.out.println(object2.x);

        Car bmw=new Car();
        Car volvo=new Car();
        volvo.culoare="albastru";
        volvo.anFabricatie=2020;
        System.out.println(bmw.culoare+" "+bmw.anFabricatie);
        System.out.println(volvo.culoare+" "+volvo.anFabricatie);


        Persoana person1=new Persoana();
        Persoana person2=new Persoana("Marcu","Raluca");
        System.out.println("Nume: " + person2.nume + " " + person2.prenume);
        System.out.println("Age: "+ person2.varsta);
        System.out.println("Gen: "+ person2.gen);


        //Tema
        Animal animal1=new Animal();
        Animal animal2=new Animal("pisica","maro");
        animal1.nume="caine";
        animal1.mananca();
        animal1.doarme();
        System.out.println(" ");
        animal2.mananca();
        animal2.doarme();
        System.out.println(" ");
        System.out.println(animal2.afiseaza());
        System.out.println(animal1.afiseaza());
        System.out.println(" ");
        System.out.println("exercitii in clasa");
        //
        Animal caine=new Animal();
        Animal papagal=new Animal();
        Animal caracatita=new Animal();
        caine.nrPicioare=4;
        papagal.nrPicioare=2;
        caracatita.nrPicioare=8;
        caine.afiseazaPicioare();
        papagal.afiseazaPicioare();
        caracatita.afiseazaPicioare();

        caine.mediuDeViata();
        papagal.mediuDeViata();
        caracatita.mediuDeViata();

        //
        System.out.println(" ");
        Film film1=new Film();
        film1.setTitlu("Avatar2");
        film1.getTitlu();

        film1.rating=7.9;
        film1.portivitPtCopii=false;

        film1.afiseazaDacaEPotrivitPtCopii();
        System.out.println(film1.anProductie);
        Film film2=new Film("Motanul Incaltat2", 2021, true );
        System.out.println(film2.rating);
        film2.afiseazaDacaEPotrivitPtCopii();
        film2.rating=8.0;
        System.out.println(film1.afiseazaRating());
        System.out.println(film2.afiseazaRating());

        System.out.println(Film.afiseazaUnText());

        afiseaza2();

        }
    public static void afiseaza2(){
        System.out.println("Afiseaza");











    }
}