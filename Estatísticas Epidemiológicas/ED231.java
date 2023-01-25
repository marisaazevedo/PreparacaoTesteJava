import java.util.Scanner;

public class ED231 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int lista[] = new int[N];
        int numero;
        int flag;

        for(int i = 0; i < N; i++) {
            numero = stdin.nextInt();
            lista[i] = numero;
        }

        flag = stdin.nextInt();

        if(flag == 1) {
            flag1(lista, N);
        }
        else if(flag == 2) {
            flag2(lista, N);
        }
        else {
            flag3(lista, N);
        }
    }

    public static void flag1(int lista[], int N) {
        int minimo = lista[1] - lista[0];
        int maximo = lista[1] - lista[0];

        for(int i = 1; i < N; i++) {
            if(lista[i] - lista[i - 1] < minimo) {
                minimo = lista[i] - lista[i - 1];
            }
            else if(lista[i] - lista[i - 1] > maximo) {
                maximo = lista[i] - lista[i - 1];
            }
        }
        System.out.println(minimo + " " + maximo);
    }

    public static void flag2(int lista[], int N) {
        double percentagem;
        int contador_ciclos = 0;
        int tamanho_ciclo = 0;
        int maior_tamanho = 0;

        for(int i = 1; i < N; i++) {
            percentagem = ((double)(lista[i] - lista[i - 1]) / lista[i - 1]) * 100;

            if(percentagem <= 5.00) {
                tamanho_ciclo++;
                if(tamanho_ciclo > maior_tamanho) {
                    maior_tamanho = tamanho_ciclo;
                }
            }
            else {
                if(tamanho_ciclo != 0) {
                    contador_ciclos++;
                }
                tamanho_ciclo = 0;
            }
        }
        if(tamanho_ciclo != 0) {
            contador_ciclos++;
        }
        System.out.println(contador_ciclos + " " + maior_tamanho);
    }

    public static void  flag3(int[] lista, int N){
        int altura = lista[N - 1] / 100;

        for (int i = altura; i > 0; i--) {
            for (int j = 0; j < N; j++) {
                if (lista[j] / 100 >= i) {
                    System.out.print("#");
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
