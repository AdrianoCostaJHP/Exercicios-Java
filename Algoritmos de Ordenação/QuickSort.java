public class QuickSort {

    public static void main(String[] args) {
        int lista[] = { -9, -25, 2, 11, 10, 1, 48, 15 };
        lista = quickSort(lista, 0, lista.length - 1);

        for(int num: lista){
            System.out.print(num+", ");
        }
    }

    public static int [] quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = quick(array, inicio, fim);
            quickSort(array, inicio, posicaoPivo - 1);
            quickSort(array, posicaoPivo + 1, fim);
        }
        return array;
    }

    public static int quick(int[] array, int inicio, int fim) {
        int pivo = array[inicio];
        int Inicio = inicio + 1;
        int Fim = fim;

        while (Inicio <= Fim) {
            if (array[Inicio] <= pivo)
                Inicio++;
            else if (pivo < array[Fim])
                Fim--;
            else {
                int troca = array[Inicio];
                array[Inicio] = array[Fim];
                array[Fim] = troca;
                Inicio++;
                Fim--;
            }
        }
        array[inicio] = array[Fim];
        array[Fim] = pivo;
        return Fim;
    }
}