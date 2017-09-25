package bloc1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Exercicis2 {



    public static void main(String[] args) {
        //Exercici 1
        List<Integer> list1 = new ArrayList<>();

        list1.add(Integer.parseInt("16"));
        list1.add(Integer.parseInt("2"));
        list1.add(Integer.parseInt("6"));

        System.out.println("Size: " + list1.size());

        //elevar al quadrat
        for(int i = 0; i< list1.size(); i++){
            list1.set(i, (int) Math.pow(list1.get(i), 2));

        }

        for(int i = 0; i< list1.size(); i++){
            if(list1.get(i)>100){
                list1.remove(i);
                i--;
            }

        }

        Collections.sort(list1, new Comparator<Integer>() {
                @Override
                public int compare(Integer i1, Integer i2) {
                    return i1 - i2;
                }
        });

        for(int i : list1){
            System.out.println(i);
        }

        //Exercici2
        List<Integer> list2 = new ArrayList<>();

    }

}
