package bloc1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercici1 {

    public static void main(String[] args) {

        ArrayList aList = new ArrayList();
        LinkedList lList = new LinkedList();

        //Array list
        long tempsInicial = System.nanoTime();

        for (int i=0; i<10000; i++){
            lList.add(i);
        }

        long tempsFinal = System.nanoTime();
        System.out.println(tempsFinal-tempsInicial);

        //Linked list
        tempsInicial = System.nanoTime();

        for (int i=0; i<10000; i++){
            aList.add(i);
        }

        tempsFinal = System.nanoTime();

        System.out.println(tempsFinal-tempsInicial);

    }
}
