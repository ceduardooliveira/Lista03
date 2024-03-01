import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Informe um numero inteiro: ");
        int numero = sc.nextInt();

        if (numero < 0){
            System.out.println("Por favor, insira um numero positivo.");
        }
        else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial de " + numero + " é: " + fatorial);
        }

        sc.close();

    }
}