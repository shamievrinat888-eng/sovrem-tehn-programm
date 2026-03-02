public class Task8 {
    public static void main(String[] args) {
        double[][] A = new double[12][6];
        double[] result = new double[6];

        for (int j = 0; j < 6; j++) result[j] = 1;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = Math.random() * 20 - 10;
                System.out.print(A[i][j] + "\t");
                if (A[i][j] < 0) result[j] *= A[i][j];
            }
            System.out.println();
        }

        System.out.println("Произведение:");
        for (double x : result) System.out.print(x + " ");
    }
}