package org.example;

public class Main {
    public static void main(String[] args) {
        calculator(5,55,'+');
        calculator(5,55,'/');
        calculator(5,55,'*');
    }

    private static void calculator(int a , int b , char operation){
        if(operation == '+'){
            System.out.println(a+b);
        }
        else if (operation == '*'){
            System.out.println(a*b);
        }

        else if (operation == '/'){
            if(a <= 0) {
                System.out.println("impossible");
            }

            else{
                System.out.println(a / b);
            }

        }


        else {
            System.out.println(a-b);
        }
    }
}