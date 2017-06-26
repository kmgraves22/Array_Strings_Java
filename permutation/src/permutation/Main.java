package permutation;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      UI.prompt_1();
      String a = input.nextLine();
      UI.prompt_2();
      String b = input.nextLine();
      if (isPermutation(a,b)){
         UI.isPerm();
      }
      else {
         UI.notPerm();
      }
      input.close();
      System.exit(0);
   }
   
   private static boolean isPermutation(String a, String b){
      if (a.length() != b.length()){
         return false;
      }
      for (int i = 0; i < a.length(); i++) {
         String temp;
         if (i + 1 < a.length()) {
            temp = a.substring(i, i+1);
         }
         else {
            temp = a.substring(i);
         }
         if (!b.contains(temp)){
            return false;
         }
      }
      return true;
   }
}
