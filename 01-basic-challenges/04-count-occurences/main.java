package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(countOccurrences("hello", 'l'));
    }

    private static int countOccurrences(String msg, char target){
        int score = 0;
        for(int i = 0 ; i < msg.length() ; i++){
            if(msg.charAt(i) ==  target){
                score++;
            }

        }

        return score;
    }
}