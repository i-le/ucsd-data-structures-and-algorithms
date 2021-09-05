package cse41321.homework;

import cse41321.containers.Heap;

import java.util.Comparator;

public class Homework7 {
    private final ArrayList<Person> list = new ArrayList<Person>();

    class Person {
        String name;
        int age;
        double height;
    }
    // common error by defining if array of Person is empty, then return null
    public Person remove() {
        int count = 0;
        if (list.isEmpty()) {
            return null;
        }
    }

    // building a heap named outputSorted contains Person
    public static void outputSorted(Person person, int count, Comparable key1, Comparable key2) {
        if (count >0) {
            int i = 0;
            // finding person array in the location of heap
            Heap heap = sizeOf(person);
            // for loop thru the person array to ascending person.name
            for (i = 0; i < count; ++i) {
                assert (heap.insert(heap, person + i) == 0);
            }
            assert(heap.getSize() == count);

            while (heap.getSize(heap) > 0) {
                return person;

                assert(heap.extract(heap, person) == 0);
                assert(person != null);
                System.out.println(person);
                System.out.println("\n");
            }
        }
    }

    // b)(1 point)Demonstrate  outputSortedtaking an array of at least 5 unsorted people then outputting those people sorted by ascending name.
    public static int compareAscendingName(Person person1, Person person2)
    {
        // make it campareable with their names
        String l1 = person1.name;
        String l2 = person2.name;

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)person1.charAt(i);
            int str2_ch = (int)person2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        // Edge case for strings like
        if (l1 != l2) {
            return -1;
        }
        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }
    }

    // c)(1 point)Demonstrate  outputSortedtaking an array of at least 5 unsorted people then outputting those people sorted by ascending age.
    public static int compareAscendingAge(Person person1, Person person2)
    {
        // make it campareable with their ages
        int l1 = person1.age;
        int l2 = person2.age;
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)person1.charAt(i);
            int str2_ch = (int)person2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        // Edge case for strings like
        // int is different then string which can be persented by using "-" math sign
        if (l1 != l2) {
            return 11 - l2
        }
        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }

    // d)(1 point)Demonstrate  outputSortedtaking an array of at least 5 unsorted people then outputting those people sorted by ascending height.

    public static int compareAscendingHeight(Person person1, Person person2)
    {
        // make it campareable with their ages
        double l1 = person1.height;
        double l2 = person2.height;
        double lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)person1.charAt(i);
            int str2_ch = (int)person2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        // Edge case for strings like
        // int is different then string which can be persented by using "-" math sign
        if (l1 != l2) {
            return 11 - l2
        }
        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }
}
    // e)(1 point)Make sure your source code is well-commented, consistently formatted, uses no magic numbers/values, follows programming best-practices, and is ANSI-compliant.
    //yes my code is well-commented.




