import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n para gerar a sequência de Fibonacci: ");
        int n = sc.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");

        if (n >= 1) {
            System.out.print(primeiroTermo);
        }

        if (n >= 2) {
            System.out.print(", " + segundoTermo);
        }

        for (int i = 3; i <= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(", " + proximoTermo);

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        sc.close();
    }
}