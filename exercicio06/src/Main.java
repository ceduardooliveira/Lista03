import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero inteiro: ");
        int numero1 = sc.nextInt();

        System.out.println("Informe o segundo numero inteiro: ");
        int numero2 = sc.nextInt();

        System.out.println("Numeros entre " + numero1 + " e " + numero2 + ":");

        int menorNumero = Math.min(numero1, numero2);
        int maiorNumero = Math.max(numero1, numero2);

        for (int i = menorNumero + 1; i < maiorNumero; i++){
            System.out.println(i + " ");
        }

        sc.close();
    }
}