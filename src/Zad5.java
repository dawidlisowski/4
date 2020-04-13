import java.util.Scanner;

public class Zad5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Text: ");
        String text = scanner.next();
        System.out.print("Ile razy: ");
        int ile = scanner.nextInt();
        System.out.print("Wydrukować text?(1-tak, 2-nie)");
        int print = scanner.nextInt();

        for(; ile>0; )
        {
            switch (print)
            {
                case 1:
                    System.out.println(text);
                    ile--;
                    break;
                case 2:
                    System.out.println("Ok Pa Pa");
                    ile = 0;
                    break;
                default:
                    System.out.print("Nie rozumiem. Wydrukować text?(1-tak, 2-nie)");
                    print = scanner.nextInt();
            }
        }
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.next();
//        int number = scanner.nextInt();
//        int print = 0;
//        boolean b = true;
//        System.out.println("Wydrukowac podany tekst? 1-tak 2-nie");
//        while(b)
//        {
//            print = scanner.nextInt();
//            if(print==1||print==2)
//                b = false;
//            else
//                System.out.println("Nie zrozumialem, wydrukowac podany tekst? 1-tak 2-nie");
//        }
//
//        if(print==1)
//            for(int i = 0; i<number; i++)
//                System.out.println(text);

    }
}
