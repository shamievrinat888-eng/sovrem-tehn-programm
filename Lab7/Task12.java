import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] B = new int[25];

        for (int i = 0; i < B.length; i++) {
            B[i] = (int)(Math.random() * 100);
            System.out.print(B[i] + " ");
        }

        Arrays.sort(B);

        System.out.println("\nОтсортировано:");
        for (int x : B) System.out.print(x + " ");
    }
}