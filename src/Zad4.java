import java.util.Scanner;

public class Zad4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name ");
        String name = scanner.next();
        System.out.print("Surname ");
        String surname = scanner.next();
        System.out.print("Phone ");
        int phone = scanner.nextInt();
        System.out.println("-----------------");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(phone);
    }
}
