// FixDebugSix2.java
// Display every character between Unicode 65 and 122
// Start new line after 20 characters
public class FixDebugSix2
{
   public static void main(String args[])
   {
      char letter = 'a';
      int a;
      final int MIN = 65;
      final int MAX = 122;
      for(a = MIN; a <= MAX; a++) {
          letter = (char) a;
          System.out.print("  " + letter);
          if((a+1-MIN)%20 == 0){
              System.out.println();
          }
      }
      System.out.println("\nEnd of application");
    }
}