public class ClassNameHere {
   public static void drawTriangle(int N) {
      int row = 0;
      int col = 0;

      while (row < N) {
         col = 0;
         while (col < row) {
            System.out.print('*');
            col += 1;
         }
         row += 1;
         System.out.println('*');
      }
   }


/* Another version */

/*
public class ClassNameHere {
   public static void drawTriangle(int N) {
      int row = 0;

      while (row < N) {
         int col = 0;  // Initialize `col` inside the outer loop
         while (col <= row) {  // Print `row + 1` stars
            System.out.print('*');
            col += 1;
         }
         System.out.println();  // Move to the next line after printing the row
         row += 1;
      }
   }

   public static void main(String[] args) {
      drawTriangle(10);
   }
}

*/

   public static void main(String[] args) {
      drawTriangle(10);
   }
}