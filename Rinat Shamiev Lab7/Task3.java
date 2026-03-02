public class Task3 {
    public static void main(String[] args) {
        double[] A = new double[12];
        double product = 1;
        boolean found = false;

        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 20 - 10;
            System.out.print(A[i] + " ");
            if (A[i] < 0) {
                product *= A[i];
                found = true;
            }
        }

        System.out.println("\nПроизведение = " + (found ? product : 0));
    }
}