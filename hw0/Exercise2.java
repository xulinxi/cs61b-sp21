// Exercise 2 max function

public class MaxWhileLoop{
   public static int max(int[] m) {
      if (m.length == 0) {
        throw new IllegalArgumentException("Array cannot be empty.");
      }

      int maxNum = m[0];
      int currentIndex = 1;
      int arrayLength = m.length;

      while (currentIndex < arrayLength) {
         if (m[currentIndex] > maxNum) {
            maxNum = m[currentIndex];
         }

         currentIndex += 1;
      }
      return maxNum;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      System.out.println(max(numbers));
   }
}