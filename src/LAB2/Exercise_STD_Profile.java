package LAB2;

import java.util.Scanner;

public class Exercise_STD_Profile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("FullName : ");
        String fullname = sc.nextLine();

        System.out.print("ID : ");
        String std_id = sc.nextLine();

        System.out.print("Age : ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Tel : ");
        String tel = sc.nextLine();

        System.out.print("E-mail : ");
        String mail = sc.nextLine();

        System.out.println("______________________________");
        System.out.println("ชื่อ-นามสกุล : "+fullname);
        System.out.println("รหัสนักศึกษา : "+std_id);
        System.out.println("อายุ : "+age);
        System.out.println("เบอร์โทรศัพท์ : "+tel);
        System.out.println("E-mail : "+mail);


    }
}
