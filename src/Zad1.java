import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Zad1 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int a = scanner.nextInt();
        boolean b = true;

        if(a==0||a==1||a==4)
        {
            b = false;
        }
        if(a==2)
        {
            b = true;
        }
        for(int i = 2; i<a/2; i++)
        {
            if(a%i!=0) continue;
            {
                b = false;
            }
        }
        if (b)
        {
            System.out.println(a + " jest liczbą pierwszą");
        }
        else
            System.out.println(a + " nie jest liczbą pierwszą");

    }
}
