package LAB3;

import java.util.Scanner;

public class ex_for2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("Enter Integers: ");
            int num = sc.nextInt();
            total += num;
        }
        System.out.println("Total: "+total);
        System.out.println("Average: "+(total/5));
        System.out.println("Good Bye.");
    }
}
