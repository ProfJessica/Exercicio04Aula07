package exercicio04aula07;
import java.util.Scanner;

public class Exercicio04Aula07 {

    public static void main(String[] args) {
        // Construa em Java, um programa que receba dois números inteiros e 
        // verifique se eles estão em ordem crescente ou decrescente, 
        // O programa deve ser encerrado quando os dois números informados 
        // forem de igual valor. Utilizando seus conhecimentos de estruturas 
        // condicionais para verificação.
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();

        while (n1 != n2) {
            if (n1 < n2) {
                System.out.println("Ordem crescente");
            } else{
                System.out.println("Ordem decrescente");
            }
            System.out.println("Digite o primeiro número: ");
            n1 = input.nextInt();
            System.out.println("Digite o segundo número: ");
            n2 = input.nextInt();
        }

//        int num1 = 0;
//        int num2 = 1;
//
//        while (num1 != num2) {
//            Scanner lerNum = new Scanner(System.in);
//            System.out.println("Digite o primeiro número: ");
//            num1 = lerNum.nextInt();
//
//            System.out.println("Digite o segundo número: ");
//            num2 = lerNum.nextInt();
//
//            if (num1 > num2) {
//                System.out.println("Ordem Decrescente");
//            } else if (num1 < num2) {
//                System.out.println("Ordem Crescente");
//            } else {
//                System.out.println("Os números são iguais.");
//            }
//        }
    }
}
