import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

public class StructuriDeDate {
    public static void main(String[] args){
        ArrayList<String> listaNoastra= new ArrayList<>();
        listaNoastra.add("First");
        listaNoastra.add("Second");
        listaNoastra.set(0,"First updated");
        listaNoastra.add("Third");
        //listaNoastra.remove(0);
        System.out.println(listaNoastra.indexOf("Second"));

        for( String value: listaNoastra){
            System.out.println(value);
        }

//        HashMap<Integer,String> dictionarulNostru= new HashMap<>();
//        dictionarulNostru.put(1,"First");
//        dictionarulNostru.put(2,"Second");
//        dictionarulNostru.put(3,"Third");
//        dictionarulNostru.remove(1,"First updated");
       // System.out.println(dictionarulNostru.entrySet());

//
      //  import java.util.HashMap;
        HashMap<String,Boolean> cineTreceExamenul=new HashMap<String,Boolean>();
        cineTreceExamenul.put("Ana",true);
        cineTreceExamenul.put("Mihai",true);
        cineTreceExamenul.put("Andrei",false);
        cineTreceExamenul.put("Ioan",true);
        cineTreceExamenul.put("Alex",false);
       for(String nume : cineTreceExamenul.keySet()){
           if(cineTreceExamenul.get(nume)==true){
           System.out.println("key:"+nume+" value:"+cineTreceExamenul.get(nume));
       }}


    }

}
