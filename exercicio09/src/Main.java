import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            System.out.println("Bem-vindo ao Jogo da Tabuada!");

            boolean jogadorPerdeu = false;

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    int resultadoEsperado = i * j;

                    System.out.print(i + " x " + j + " = ");
                    int resultadoUsuario = sc.nextInt();

                    if (resultadoUsuario != resultadoEsperado) {
                        System.out.println("Errado! Você perdeu. Fim do jogo.");
                        jogadorPerdeu = true;
                        break;
                    }
                }

                if (jogadorPerdeu) {
                    break;
                }

                System.out.println("Correto! Próxima operação.");
            }

            if (!jogadorPerdeu) {
                System.out.println("Parabéns! Você completou toda a tabuada sem erros.");
            }

            System.out.print("Deseja jogar novamente? (S para sim, N para não): ");
            char escolha = sc.next().charAt(0);
            jogarNovamente = (escolha == 'S' || escolha == 's');
        }

        System.out.println("Obrigado por jogar!");
        sc.close();

    }
}