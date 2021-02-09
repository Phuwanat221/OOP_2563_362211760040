package LAB7;

public class EmployeeApp {
    public static void main(String[] args) {
        //use default construcyor
        Employee emp1 = new Employee();

        //assign construcyor
        Employee emp2 = new Employee("Phuwanat Kawkliang",24,"Student",9000);

        //call displayData
        emp1.displayData();
        emp2.displayData();

        //assign data to emp1
        emp1.setName("Piyapong Senanut");
        emp1.setAge(37);
        emp1.setPosition("Dean");
        emp1.setSalary(50000);

        emp1.displayData();
        System.out.println("Emp name:"+emp1.getName());



    }//main
}//class
