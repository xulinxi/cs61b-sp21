/*

*
**
***
****
*****

*/

public class DrawingATriangle {
    public static void main(String[] args) {
        // col = col + 1
        int col = 0;
        int row = 0;
        int SIZE = 5;
        // row = row + 1;

       while (row < SIZE) {
          // System.out.print('*');
          col = 0;
          while (col < row) {
             System.out.print('*');
             col += 1;
          }
          System.out.println('*');
          row += 1;
       }
    }
}