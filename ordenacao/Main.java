package ordenacao;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        System.out.println("Digite a aleatoriedade: ");
        int ate = sc.nextInt();
        sc.nextLine();

        int vet[] = new int[quantidade];

        Sort obj = new Sort();
        Random rand = new Random();

        for(int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(ate);
        }

        System.out.println("Digite 1 para Bubble e 2 para Selection");
            
        int opcao = sc.nextInt();
        if(opcao == 1){
            obj.OrdenacaoSelecao(vet);
        }else{
            obj.bubbleSort(vet);
        }
            
        }

    }
     



