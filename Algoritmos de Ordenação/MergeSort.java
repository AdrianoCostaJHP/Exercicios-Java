public class MergeSort {
    public static void main(String[] args) {
        int lista[] = { -9, -25, 2, 11, 10, 1, 48, 15 };
        lista = mergeSort(lista, 0, lista.length - 1);

        for(int num: lista){
            System.out.print(num+", ");
        }
    }

    public static int[] mergeSort(int[] vetor, int inicio, int fim) {
        if (fim <= inicio)
            return vetor;

        int meio = (inicio + fim) / 2;
        mergeSort(vetor, inicio, meio);
        mergeSort(vetor, meio + 1, fim);
        merge(vetor, inicio, meio, fim);

        return vetor;
    }

    public static void merge(int[] vetor, int inicio, int meio, int fim) {

        int leftArray[] = new int[meio - inicio + 1];
        int rightArray[] = new int[fim - meio];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = vetor[inicio + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = vetor[meio + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = inicio; i < fim + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    vetor[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    vetor[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                vetor[i] = leftArray[leftIndex];
                leftIndex++;

            } else if (rightIndex < rightArray.length) {
                vetor[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
