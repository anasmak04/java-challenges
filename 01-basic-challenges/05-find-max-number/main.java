package org.example;

public class Main {
    public static void main(String[] args) {
        int array[] = {7,9,8,4,5,22};
        System.out.println(findMaxNumber(array));
    }

    private static int findMaxNumber(int array[]){
        int max = array[0];

        for(int i = 0  ; i < array.length ; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        return  max;
    }
}