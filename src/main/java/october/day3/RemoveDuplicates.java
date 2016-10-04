package october.day3;

import java.util.ArrayList;

/**
 * Created by marom on 03/10/16.
 */
public class RemoveDuplicates {

    //Write a Java program to remove duplicate elements from an arraylist
    // without using collections (without using set)

    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<>();

        al.add("java");
        al.add('a');
        al.add('b');
        al.add('a');
        al.add("java");
        al.add(10.3);
        al.add('c');
        al.add(14);
        al.add("java");
        al.add(12);

        System.out.println("Before removing duplicates. Size: " + al.size());
        al.stream().forEach(System.out::println);

        for (int i = 0; i < al.size(); i++) {
            for (int j = i +1; j < al.size(); j++) {
                if(al.get(i).equals(al.get(j))) {
                    al.remove(j);
                    j--;
                }
            }
        }

        System.out.println("After removing duplicates. Size: " + al.size());
        al.stream().forEach(System.out::println);

    }
}
