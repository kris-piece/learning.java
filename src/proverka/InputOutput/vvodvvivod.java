package proverka.InputOutput;

import java.util.Scanner;

public class vvodvvivod {

    public static void main(String[] args) {

        Scanner no = new Scanner(System.in);
        int a = 0;
        while (a<5) {
            System.out.print("Input a number: ");
            int num = no.nextInt();
            System.out.printf("Your number: %d \n", num );
            a = a+1;
        }
        no.close();
    }
}
