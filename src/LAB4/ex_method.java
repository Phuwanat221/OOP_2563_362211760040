package LAB4;

public class ex_method {
    public static void B(int num){
        System.out.println("Hello B"+num);
    }
    public static void main(String[] args) {
        System.out.println("Hello Main");
        A();
        A();
        B(5);
        int rcsult = C(5,5);
        System.out.println(rcsult);
        System.out.println(C(10,10));
    }
    public static void A(){
        System.out.print("Hello A");

    }
    public static int C(int x ,int y){
        System.out.println("Hello C");
        return x + y;
    }
}
