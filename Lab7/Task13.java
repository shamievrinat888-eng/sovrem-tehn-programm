public class Task13 {
    public static void main(String[] args) {
        double[] C = new double[20];
        double sum = 0;

        for (int i = 0; i < C.length; i++) {
            C[i] = Math.random() * 100;
            sum += C[i];
            System.out.print(C[i] + " ");
        }

        System.out.println("\nСреднее = " + sum / C.length);
    }
}