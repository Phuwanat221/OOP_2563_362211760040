package LAB5;

import java.util.Scanner;

public class exercise_lab5 {
    public static void main(String[] args) {
        System.out.println("Inpuy Number: ");
        Scanner scanner = new Scanner(System.in);
        int num,result;
        num = scanner.nextInt();
        n_min(num);
    }
    private static void n_min(int num) {
        int count = 0;
        for (int i = num; i >=0; i--) {
            if (i%3==0 && i%5==0) {
                System.out.println(i+" ");
                count++;
            }
            if (count==3) {
                break;
            }

        }
    }
}
