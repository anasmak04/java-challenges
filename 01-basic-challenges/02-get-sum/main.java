package org.example;

public class Main {
    public static void main(String[] args) {
        int array[] = {5,4,8,7};
        System.out.println(getSum(array));
    }

    private static int getSum(int array[]){
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++){
             sum+=array[i];

        }

        return sum;
    }
}