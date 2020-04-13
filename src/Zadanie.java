import java.util.Scanner;

public class Zadanie {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        if(a<b+c&&b<a+c&&c<a+b)
        {
            System.out.println("Możliwy trójkąt");
        }
        else
            System.out.println("Trójkąt niemożliwy");
    }
}
