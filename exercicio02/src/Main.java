import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++){
            System.out.println("Informe o " + i + "º numero inteiro: ");
            int numero = sc.nextInt();

            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
        }

        System.out.println("Maior numero informado: " + maior);
        System.out.println("Menor numero informado: " + menor);

        sc.close();

    }
}