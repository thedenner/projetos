package ordenacao;

public class Sort {

    public static void OrdenacaoSelecao(int vet[]) {
        for (int i = 0; i < vet.length - 1; i++) { // posição das colunas
            int min = i; // min assume o valor da posição i
            int k;

            for (int j = i + 1; j < vet.length; j++) {
                if (vet[j] < vet[min]) { // verificar se é menor
                    min = j; // min assume o valor da posição j
                }
            }

            if (i != min) { // verificar se o conteúdo de i é igual ao do min
                k = vet[i]; // atribui o valor do vetor na variavel auxiliar
                vet[i] = vet[min]; // substitui a posição pelo conteúdo
                vet[min] = k; // atribui o menor valor à varíavel k
            }
        }

        imprimeVetor("Selection Sort", vet);
    }

    public static void bubbleSort(int vet[]) {
        int aux;

        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = 0; j < vet.length - 1 - i; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        imprimeVetor("Bubble Sort", vet);
    }

    private static void imprimeVetor(String nome, int[] vet) {
        System.out.print(nome + " ordenado: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]);
            if (i < vet.length - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
