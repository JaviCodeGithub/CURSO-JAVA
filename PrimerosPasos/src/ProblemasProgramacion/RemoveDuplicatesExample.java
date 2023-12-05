package ProblemasProgramacion;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2},
            {3, 2} // Duplicado
        };

        System.out.println("Matriz original:");
        printArray(array);

        removeDuplicates(array);

        System.out.println("\nMatriz después de eliminar duplicados:");
        printArray(array);
    }

    public static void removeDuplicates(int[][] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (uniqueElements.contains(array[i][j])) {
                    array[i][j] = 0; // Cambiar el duplicado a un valor específico, como 0
                } else {
                    uniqueElements.add(array[i][j]);
                }
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}