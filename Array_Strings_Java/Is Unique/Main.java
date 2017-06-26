import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      UI.prompt();
      String in = reader.nextLine();
      isUnique(in);
      reader.close();
      System.exit(0);
   }
   
   private static void isUnique(String in) {
      char a;
      for (int i = 0; i < in.length(); i++) {
         a = in.charAt(i);
         for (int j = i + 1; j < in.length(); j++) {
            if (a == in.charAt(j)) {
               UI.notUnique();
               return;
            }
         }
      }
      UI.isUnique();
   }
}