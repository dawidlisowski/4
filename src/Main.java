import java.util.Scanner;

public class Main {
    public static void main(String args[]){

//Instrukcje warunkowe
        //W tym przykładzie jet to traktowane jako jedna instrukcja
        //Mozna mieć wiele "else if"
        //Jeżeli wykona się któryś z tych bloków to nie wykonają się kolejne
        int a = 9;
        if(a<10)
        {
            System.out.println("a<10");
        }
        else if(a==10)
        {
            System.out.println("a=10");
        }
        else if(a==9)
        {
            System.out.println("a=9");
        }
        else
            System.out.println("a>10");

        //Jeżeli zamiast "else if" damy "if" instrukcje będą wykonaywały się oddzielnie

        int b = 8;
        if(b<10)
        {
            System.out.println("b<10");
        }
        if(b==10)
        {
            System.out.println("b=10");
        }
        if(b==9)
        {
            System.out.println("b=9");
        }
        if(b==8)
        {
            System.out.println("b=8");
        }
        else
            System.out.println("b>10");

        //Instrukcje można również zagnieżdżać
        //W tym przypadku c<10 i c!=8

        int c = 7;
        if (c < 10) {

            System.out.println("c<10");
            if(c==8)
                System.out.println("c=8");
            else
                System.out.println("c!=8");
        }

        //Instrukcja switch case
        //Jest podobna do if
        //Nie można wpisywać czy coś jest mniejsze lub większe tylko musi być równe
        //Każdy case musi być zakończony słowem break
        //Można użyć przy menu

        int d = 7;
        switch (d)
        {
            case 1:
                System.out.println("d=1");
                break;
            case 2:
                System.out.println("d=2");
                break;
            case 3:
                System.out.println("d=3");
                break;
            case 4:
                System.out.println("d=4");
                break;
            case 5:
                System.out.println("d=5");
                break;
            default:
                System.out.println("default");
        }

        //Jeżeli e < 10 przypisz f wartość -1, w innym przypadku 1
        int e = 10;
        int f;
        f = e < 10 ? -1 : 1;
        System.out.println(f);

        //Break
        //Wypisujemy i do momentu kiedy nie będzie równe 5, wtedy break

        for(int i = 0; i<10; i++)
        {
            System.out.print(i + " ");
            if(i==5)
                break;
        }
        System.out.println();

        //continue
        //Jeżeli j%2=0 np. j = 2 kontynuuj tzn zacznij iterację od początku; j = 3 wydrukuj

        for(int j = 0; j<10; j++)
        {
            if(j%2==0) continue;
            System.out.print(j + " ");
        }

        //Przekazywanie danych do programu przez urzytkownika
        //Musimy przypisać zmiennej jakąś wartość domyślną w typ przypadku name = scanner.next()

        Scanner scanner = new Scanner(System.in);

        String name;

        name = scanner.next();

        System.out.println(name);
    }
}
