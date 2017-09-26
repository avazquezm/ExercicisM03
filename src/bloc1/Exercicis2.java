package bloc1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Exercicis2 {

    public static List<Persona> menorsEdat(List<Persona> persones) {
        List<Persona> menors = new ArrayList<>();

        if(persones.get(0).getEdat() <= persones.get(persones.size()-1).getEdat()){
            for (Persona p : persones) {
                if (p.getEdat() <= 18) {
                    menors.add(p);
                } else {
                    break;
                }
            }
        }else{

        }


        return menors;
    }

    public static void main(String[] args) {
        //Exercici 1
        System.out.println("EXERCICI 1");
        List<Integer> list1 = new ArrayList<>();

        list1.add(Integer.parseInt("16"));
        list1.add(Integer.parseInt("9"));
        list1.add(Integer.parseInt("6"));
        list1.add(Integer.parseInt("7"));

        System.out.println("Size: " + list1.size());

        //elevar al quadrat
        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, (int) Math.pow(list1.get(i), 2));

        }

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) > 100) {
                list1.remove(i);
                i--;
            }

        }

        Collections.sort(list1);

//        Collections.sort(list1, new Comparator<Integer>() {
//                @Override
//                public int compare(Integer i1, Integer i2) {
//                    return i1 - i2;
//                }
//        });

//        list1.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i1, Integer i2) {
//                return i1 - i2;
//            }
//        });

        for (int i : list1) {
            System.out.println(i);
        }


        //Exercici2
        System.out.println("\nEXERCICI 2");
        List<Integer> list2 = new ArrayList<>();
        list2.add(Integer.parseInt("11"));
        list2.add(Integer.parseInt("22"));

        list1.addAll(list2);

        for (int i : list2) {
            System.out.println("List1 conté element de list2? " + list1.contains(i));
        }

        list2.clear();
        System.out.println("List2 buida? " + list2.isEmpty());

        //Exercici3 i 4
        System.out.println("\nEXERCICI 3 i 4");
        Persona p1 = new Persona("Albert", "Vazquez", "Marmol", "48096227F", "1985-09-20");
        Persona p2 = new Persona("Sam", "Muel", "Antequera", "47096527Z", "2000-12-10");
        Persona p3 = new Persona("Aitor", "Menta", "Fuerte", "46778117Y", "2005-12-10");

        List<Persona> persones = new ArrayList<>();
        persones.add(p1);
        persones.add(p2);
        persones.add(p3);

        List<Persona> menors = new ArrayList<>();
        menors.addAll(menorsEdat(persones));

        for (Persona p : menors) {
            System.out.println(p);//
        }
    }

}
