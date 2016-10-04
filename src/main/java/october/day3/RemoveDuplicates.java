package october.day3;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by marom on 03/10/16.
 */
public class RemoveDuplicates {

    //Write a Java program to remove duplicate elements from an arraylist
    public static void main(String[] args) {

        ArrayList<String> al = createArray();

        // without using collections (without using set)
        System.out.print("Before removing duplicates. Size: " + al.size()  + " ");
        al.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        for (int i = 0; i < al.size(); i++) {
            for (int j = i +1; j < al.size(); j++) {
                if(al.get(i).equals(al.get(j))) {
                    al.remove(j);
                    j--;
                }
            }
        }

        System.out.print("After removing duplicates. Size: " + al.size() + " ");
        al.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();


        // by using stream distinct() function
        al = createArray();
        List<String> listWithoutDuplicates = al.stream().distinct().collect(Collectors.toList());
        System.out.print("After removing duplicates. Size: " + listWithoutDuplicates.size() + " ");
        listWithoutDuplicates.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        // by using hash set from Collection api
        al = createArray();
        listWithoutDuplicates = new ArrayList<>(new HashSet<>(al));
        System.out.print("After removing duplicates. Size: " + listWithoutDuplicates.size() + " ");
        listWithoutDuplicates.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        // by using linked hash set set from Collection api, by using LinkedHashSet we can preserve order of original list
        al = createArray();
        listWithoutDuplicates = new ArrayList<>(new LinkedHashSet<>(al));
        System.out.print("After removing duplicates. Size: " + listWithoutDuplicates.size() + " ");
        listWithoutDuplicates.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

    }

    private static ArrayList<String> createArray() {
        ArrayList<String> al = new ArrayList<>();

        al.add("java");
        al.add("a");
        al.add("b");
        al.add("a");
        al.add("java");
        al.add("10.3");
        al.add("c");
        al.add("14");
        al.add("java");
        al.add("12");
        return al;
    }
}
