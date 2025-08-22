import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        testRadixSort(new int[]{3,1,2,9,1,2});
        testRadixSort(new int[]{2,9,4,3,7,12,13,1,100,59,2999});
        testRadixSort(new int[]{222,911,431,85,743,111,115,655,1000,59});

        testRadixSort(new int[]{5,5,5,5,5}); //test con valores duplicados
        testRadixSort(new int[]{5,4,3,2,1}); //test ordenamiento al reves
        testRadixSort(new int[]{});          //test array vacio

        timerProcess();
    }

    public static void testRadixSort(int[] arr) {
        System.out.println("Array original: " + Arrays.toString(arr));

        Radixsort radixSort = new Radixsort();
        radixSort.applySort(arr);

        System.out.println("Array organizado: " + Arrays.toString(arr));
        System.out.println();
    }

    public static void timerProcess () {
        long inicio = System.currentTimeMillis();

        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }

        long fin = System.currentTimeMillis();
        long tiempo = fin - inicio;
        System.out.println("El proceso tomo: " + tiempo + " ms");
    }
}