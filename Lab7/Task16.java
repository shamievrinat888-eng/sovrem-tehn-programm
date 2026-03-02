public class Task16 {

    public static short maxX() {
        short[] arr = new short[10];
        short max;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (short)(Math.random() * 50);
            System.out.print(arr[i] + " ");
        }

        max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) max = arr[i];

        return max;
    }

    public static void main(String[] args) {
        System.out.println("\nМаксимальный = " + maxX());
    }
}