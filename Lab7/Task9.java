public class Task9 {
    public static void main(String[] args) {
        double[][] C = new double[5][5];
        double product = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = Math.random() * 20 - 10;
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
            if (C[i][i] > 0) product *= C[i][i];
        }

        System.out.println("Произведение диагонали = " + product);
    }
}