public class Task4 {
    public static void main(String[] args) {
        double[] C = new double[25];
        double product = 1;
        boolean found = false;

        for (int i = 0; i < C.length; i++) {
            C[i] = Math.random() * 20 - 10;
            System.out.print(C[i] + " ");
            if (C[i] > 0) {
                product *= C[i];
                found = true;
            }
        }

        System.out.println("\nПроизведение = " + (found ? product : 0));
    }
}