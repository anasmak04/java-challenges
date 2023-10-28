package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(countVowels("hello"));
    }

    private static int countVowels(String str) {
        char[] c = str.toCharArray();
        int count = 0;
        for(int i = 0 ; i < c.length ; i++){
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'u' || c[i] == 'o'){
                count++;
            }
        }

        return count;
    }
}