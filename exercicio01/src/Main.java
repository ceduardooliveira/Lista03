import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a tabuada que você deseja: ");
        int numero = scanner.nextInt();

        System.out.println("A tabuada de " + numero + " é >");

        for (int i = 0; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }

        scanner.close();
    }
}