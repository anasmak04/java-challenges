
package org.example;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    int array[] = {55,88,99,77,4,5,1,0,0,4,9};
        removeDuplicates(array);
    }

    private static void removeDuplicates(int[] numbers) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int n : numbers){
            set.add(n);
        }

        for(Integer numberset : set){
            System.out.println(numberset);
        }
    }
}