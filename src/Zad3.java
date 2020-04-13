import java.util.Scanner;

public class Zad3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Styl: ");
        int styl = scanner.nextInt();
        System.out.print("Efekty: ");
        int efekty = scanner.nextInt();
        System.out.print("Rezultat: ");
        int rezultat = scanner.nextInt();
        double wynik = styl*0.2+efekty*0.3+rezultat*0.5;
        System.out.println("Wynik = " + wynik);
    }
}
