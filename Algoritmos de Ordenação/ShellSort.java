public class ShellSort {
    public static void main(String[] args) {
        int lista[] = { -9, -25, 2, 11, 10, 1, 48, 15 };
        lista = shellSort(lista);

        for(int num: lista){
            System.out.print(num+", ");
        }
    }
    public static int [] shellSort(int[] vetor) {
        int i, j, temp, size = vetor.length;

        int incremento = 1;
        while (incremento < size) {
            incremento = 3 * incremento + 1;
        }

        while (incremento > 1) {
            incremento /= 3;

            for (i = incremento; i < size; i++) {
                temp = vetor[i];
                j = i - incremento;
                while (j >= 0 && temp < vetor[j]) {
                    vetor[j + incremento] = vetor[j];
                    j -= incremento;
                }
                vetor[j + incremento] = temp;
            }
        }
        return vetor;
    }
}
