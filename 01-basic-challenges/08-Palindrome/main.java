package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(Palindrome("racecar"));
    }

    private static boolean Palindrome(String str) {
        String str1 = str;
        StringBuilder str2 = new StringBuilder();
        for(int i = str.length() - 1 ; i>=0 ; i--){
            str2.append(str.charAt(i));
        }
        return str1.equals(str2.toString());
    }
}