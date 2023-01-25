import java.util.Scanner;

public class ED268 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int tamanho;

        for(int i = 0; i < N; i++) {
            tamanho = stdin.nextInt();
            lambda(tamanho);
        }

        stdin.close();
    }

    public static void lambda(int tamanho) {
        char ponto = '.';
        char cardinal = '#';
        int pontos_inicio = 0;
        int pontos_fim = tamanho - 1;

        // parte do inicio
        for(int i = 0; i < tamanho / 2; i++) {
            for(int p_i = 0; p_i < pontos_inicio; p_i++) {
                System.out.print(ponto);
            }
            System.out.print(cardinal);
            for(int p_f = 0 ; p_f < pontos_fim; p_f++) {
                System.out.print(ponto);
            }
            pontos_fim--;
            pontos_inicio++;
            System.out.println();
        }

        // parte do meio
        for(int i = 0; i < tamanho / 2; i++) {
            System.out.print(ponto);
        }
        System.out.print(cardinal);
        for(int i = 0; i < tamanho / 2; i++) {
            System.out.print(ponto);
        }
        System.out.println();

        // parte do fim
        pontos_inicio = (tamanho - 3) / 2;
        pontos_fim = (tamanho - 3) / 2;
        int pontos_meio = 1;
        for(int i = 0; i < tamanho / 2; i++) {
            for(int p_i = 0; p_i < pontos_inicio; p_i++) {
                System.out.print(ponto);
            }
            System.out.print(cardinal);
            for(int p_m = 0; p_m < pontos_meio; p_m++) {
                System.out.print(ponto);
            }
            System.out.print(cardinal);
            for(int p_f = 0 ; p_f < pontos_fim; p_f++) {
                System.out.print(ponto);
            }
            pontos_inicio--;
            pontos_meio += 2;
            pontos_fim--;
            System.out.println();
        }
    }
}
