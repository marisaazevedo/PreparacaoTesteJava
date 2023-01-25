import java.util.Scanner;

public class ED235 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int t;

        for(int i = 0; i < n; i++) {
            t = stdin.nextInt();
            triangulo(t);
        }
    }
    public static void triangulo(int t) {
        String linha = "";
        int pontos = 0;

        while(t > 0) {
            for(int i = 0; i < t; i++) {
                linha += "#";
            }
            for(int i = 0; i < pontos; i++) {
                linha += ".";
            }
            pontos++;
            t--;
            System.out.println(linha);
            linha = "";
        }
    }
}
