// Exercise 3 max function using for loop

public class MaxForLoop {
    public static int max(int[] m) {

        if (m.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int forMax = m[0];
        for (int i = 1; i < m.length; i++) {
            if (m[i] > forMax) {
                forMax = m[i];
            }
        }
    return forMax;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}