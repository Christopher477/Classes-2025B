import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] test = new int[100];
        testRadixSort(new int[]{5,4,3,2,1}); //test ordenamiento al reves
        testRadixSort(new int[]{});          //test array vacio

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(1000);
            test[i] = numero;
        }
        testRadixSort(test);

        timerProcess();
    }

    public static void testRadixSort(int[] arr) {
        System.out.println("Array original: " + Arrays.toString(arr) + "\n");

        Radixsort radixSort = new Radixsort();
        radixSort.applySort(arr);

        System.out.println("Array organizado: " + Arrays.toString(arr));
        System.out.println();
    }

    public static void timerProcess () {
        long inicio = System.nanoTime();
        long fin = System.nanoTime();
        long tiempo = fin - inicio;
        System.out.println("Tardó: " + tiempo + " nanosegundos");
    }
}