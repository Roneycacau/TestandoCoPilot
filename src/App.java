import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String names[] ={"Aline","Amanda","Ana","Romeu","Julieta","Juliete","Norberto","Ema","Emanuel","Emanuela","Jaquisom","Trambolho","Valeska","Xandao","Ananda","Bia","Beatriz","Carla","Carlos","Cesar","Cosmos","Zaza","Debora","Zoraide","Zuleika"};
        
        Dicionario dicionario = new Dicionario();

        System.out.println("======================");

        System.out.println("Lista está vazia? " + (dicionario.isEmpty()? "Sim" : "Não"));

        System.out.println("Quantidade de itens na lista: " + dicionario.count());
        
        //print all words in dicionario
        System.out.println("LISTA");
        dicionario.print(); 
        System.out.println("======================");

        

        //add names from array names to dicionario
        for (int i = 0; i < names.length; i++) {
            dicionario.add(names[i]);
        }

        System.out.println("Lista está vazia? " + (dicionario.isEmpty()? "Sim" : "Não"));

        System.out.println("Quantidade de itens na lista: " + dicionario.count());

        //add name to dicionario
        dicionario.add("abacaxi");
        dicionario.print();
        System.out.println(dicionario.count());
        
        //encontrar nome no dicionario
        System.out.println(dicionario.indexOf("Valeska"));

        //print nome especifico do dicionario
        dicionario.print("Valeska");

        //update Valeska to Valesca
        dicionario.update("Valeska", "Valesca");

        System.out.println("======================");

        //print all words in dicionario
        dicionario.print();
        System.out.println("======================");


        //remove Valesca
        dicionario.remove("Valesca");

        System.out.println("======================");

        //print all words in dicionario
        dicionario.print();
        System.out.println("======================");

    }
}