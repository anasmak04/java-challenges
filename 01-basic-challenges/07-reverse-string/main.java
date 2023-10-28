package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("olleh"));
    }

    private static String reverseString(String str) {
        StringBuilder strb = new StringBuilder();
       for(int i = str.length() - 1 ; i >= 0 ; i--){
           strb.append(str.charAt(i));
       }

       return strb.toString();
    }
}