package EstruturaDeDesisao;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é positivo ou negativo: ");
        int numero = Integer.parseInt(leitor.nextLine());

        if (numero > 0)
            System.out.println("Positivo");
        else if (numero < 0)
            System.out.println("Negativo");
        else
            System.out.println("Neutro");
    }
}
