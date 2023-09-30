package EstruturaDeRepeticao;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade = 0;
        do {
            System.out.print("Digite sua idade: ");
            idade = Integer.parseInt(leitor.nextLine());

            if (idade < 18)
                System.out.println("Idade inválida!");
        } while (idade < 18);
        System.out.println("Idade válida");
    }
}
