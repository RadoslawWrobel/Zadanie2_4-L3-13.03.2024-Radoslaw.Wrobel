import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

public class Main 
  {
  public static void main(String[] args) 
  {
      {
          int a = 0;
          int b = 0;

          Scanner SkanerKalkulatora = new Scanner(System.in);
          System.out.println("Wprowadz wartosci dla zmiennych a oraz b :\n");

          try {
            a = SkanerKalkulatora.nextInt();
            b = SkanerKalkulatora.nextInt();
          } catch (InputMismatchException e) {
            System.out.println("Wprowadzono niepoprawne dane!");
          }

          int suma = (a + b);
          int roznica = (a - b);
          int iloczyn = (a * b);
          int iloraz = (a / b);

          System.out.println("Podaj numer operacji, ktora chcesz wykonac: \n");
          System.out.println("1. Suma\n");
          System.out.println("2. Roznica\n");
          System.out.println("3. Iloczyn\n");
          System.out.println("4. Iloraz\n");

          int wybor = SkanerKalkulatora.nextInt();
          switch (wybor) {
            case 1:
              System.out.println("Suma wynosi: " + suma);
              break;
            case 2:
              System.out.println("Roznica wynosi: " + roznica);
              break;
            case 3:
              System.out.println("Iloczyn wynosi: " + iloczyn);
              break;
            case 4:
              if (b == 0) {
                System.out.println("Nie mozna dzielic przez zero!\n");
                break;
              } else {
                System.out.println("Iloraz wynosi: " + iloraz);
                break;
              }
            default: {
              System.out.println("Niewlasciwa operacja!\n");
              break;
          }
        }
      }
    }
  }