package LAB8;

public class PersonApp {
    public static void main(String[] args) {

        //objects
        Person p1 = new Person();
        p1.setName("Phuwanat Kawkliang");
        p1.setAge(24);

        Person p2 = new Teacher("RUTS");
        p2.setName("Piyapong Sananut");
        p2.setAge(37);


        Person p3 = new Doctor("Thungsong");
        p3.setName("Nattapong Kaewboonam");
        p3.setAge(40);

        //call introduce
        p1.introduce();
        p2.introduce();
        p3.introduce();

    }
}
