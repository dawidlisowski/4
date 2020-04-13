import java.util.Scanner;

public class Zad2 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz 3 liczby od 1 do 100:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        for(int i = 0; i<=100; i++)
        {
            if(i==a)
                System.out.println(a);
            if(i==b)
                System.out.println(b);
            if(i==c)
                System.out.println(c);
        }
    }
}
