package bloc1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercici1 {

    public static void main(String[] args) {

        ArrayList aList = new ArrayList();
        LinkedList lList = new LinkedList();

        for (int i = 0; i < 10000000; i++) {
            aList.add(i);
        }

        for (int i = 0; i < 10000000; i++) {
            lList.add(i);
        }


        //Linked list
        long tempsInicial = System.nanoTime();
        lList.add(1223);
        long tempsFinal = System.nanoTime();
        System.out.println("linkedList: " + (tempsFinal - tempsInicial));

        tempsInicial = System.nanoTime();
        lList.add(0, 1223);
        tempsFinal = System.nanoTime();
        System.out.println("linkedList pos0: " + (tempsFinal - tempsInicial));

        tempsInicial = System.nanoTime();
        lList.add(5000000, 1223);
        tempsFinal = System.nanoTime();
        System.out.println("linkedList pos5000000: " + (tempsFinal - tempsInicial));

        tempsInicial = System.nanoTime();
        lList.add(10000000, 1223);
        tempsFinal = System.nanoTime();
        System.out.println("linkedList pos10000000: " + (tempsFinal - tempsInicial));

        tempsInicial = System.nanoTime();
        lList.get(0);
        tempsFinal = System.nanoTime();
        System.out.println("linkedList get pos0: " + (tempsFinal - tempsInicial));

        tempsInicial = System.nanoTime();
        lList.get(5000000);
        tempsFinal = System.nanoTime();
        System.out.println("linkedList get pos5000000: " + (tempsFinal - tempsInicial));

        tempsInicial = System.nanoTime();
        lList.get(10000000);
        tempsFinal = System.nanoTime();
        System.out.println("linkedList get pos10000000: " + (tempsFinal - tempsInicial));

        //Array list
        tempsInicial = System.nanoTime();
        aList.add(1223);
        tempsFinal = System.nanoTime();
        System.out.println("arraList: " + (tempsFinal - tempsInicial));

        tempsInicial = System.nanoTime();
        aList.add(0, 1223);
        tempsFinal = System.nanoTime();
        System.out.println("arrayList pos0: " + (tempsFinal - tempsInicial));

        tempsInicial = System.nanoTime();
        aList.add(5000000, 1223);
        tempsFinal = System.nanoTime();
        System.out.println("arrayList pos5000000: " + (tempsFinal - tempsInicial));

        tempsInicial = System.nanoTime();
        aList.add(10000000, 1223);
        tempsFinal = System.nanoTime();
        System.out.println("arrayList pos10000000: " + (tempsFinal - tempsInicial));

        tempsInicial = System.nanoTime();
        aList.get(0);
        tempsFinal = System.nanoTime();
        System.out.println("arrayList get pos0: " + (tempsFinal - tempsInicial));

        tempsInicial = System.nanoTime();
        aList.get(5000000);
        tempsFinal = System.nanoTime();
        System.out.println("arrayList get pos5000000: " + (tempsFinal - tempsInicial));

        tempsInicial = System.nanoTime();
        aList.get(10000000);
        tempsFinal = System.nanoTime();
        System.out.println("arrayList get pos10000000: " + (tempsFinal - tempsInicial));


    }
}
