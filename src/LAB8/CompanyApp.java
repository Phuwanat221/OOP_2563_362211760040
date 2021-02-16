package LAB8;

import LAB7.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employee do you have?: ");
        int num = sc.nextInt();

        ArrayList<Employee> myEmp = new ArrayList<Employee>();
        for (int i = 0; i < num; i++){
            //input data to object
            System.out.println("Please, enter employee info "+(i+1)+":");
            Employee cc = inputDataObject();
            myEmp.add(cc);
        }
        //display data in ArrayList
        displayObject(myEmp);

    }
    private static void displayObject(ArrayList<Employee> myEmp) {
        System.out.println("All objects in ArrayList: ");
        for (Employee cc:myEmp){
            System.out.println(cc.toString());
        }
    }
    private static Employee inputDataObject() {
        Scanner sc = new Scanner(System.in);

        Employee cc = new Employee();

        System.out.print("Enter id card: ");
        cc.setPid(sc.nextLine());

        System.out.print("Enter name: ");
        cc.setName(sc.nextLine());

        System.out.print("Enter Age: ");
        cc.setAge(Integer.parseInt(sc.nextLine()));

        System.out.print("Enter gender: ");
        cc.setGender(sc.nextLine());

        System.out.print("Enter telephone: ");
        cc.setTel(sc.nextLine());

        System.out.print("Enter employee id: ");
        cc.setEmpID(sc.nextLine());

        System.out.print("Enter position: ");
        cc.setPosition(sc.nextLine());

        System.out.print("Enter salary: ");
        cc.setSalary(Double.parseDouble(sc.nextLine()));

        return cc;
    }
}
//        Employee emp1 = new Employee();
//
//        emp1.setEmpID("1801478523694");
//        emp1.setName("Phuwanat Kawkliang");
//        emp1.setAge(24);
//        emp1.setGender("Male");
//        emp1.setTel("0878950023");
//
//        emp1.setEmpID("emp001");
//        emp1.setPosition("Programmer");
//        emp1.setSalary(50000.00);
//
//        //display object data
//        System.out.println(emp1.toString());