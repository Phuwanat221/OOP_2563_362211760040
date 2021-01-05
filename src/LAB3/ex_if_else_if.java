package LAB3;

import java.util.Scanner;

public class ex_if_else_if {

    public static void main(String[] args) {
        //ให้ผู้ใช้ใส่ค่าคะแนนเข้ามา แล้วแสดงผมลัพธ์เป็นเกรด
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter your score: ");
        int score = sc.nextInt(); // input as integer
        int score2 = Integer.parseInt(sc.nextLine()); //input as string
        //0-49 == F
        //50-59 == D
        //60-69 == C
        //70-79 == B
        //80-100 == A
        if (score >=0 && score<=49){
            System.out.println("F");
        }
    }
}
