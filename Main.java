import java.util.Scanner;

class Main {
  public static void main(String[] args) {
       int height = 10; // wysokość choinki
        int spaces = height - 1; // liczba spacji na początku wiersza

        for (int i = 0; i < height; i++) {
            // wyświetlanie spacji na początku wiersza
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            
            // wyświetlanie gwiazdek w wierszu
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            
            // przechodzenie do następnego wiersza
            System.out.println();
            spaces--;
  }
}
}