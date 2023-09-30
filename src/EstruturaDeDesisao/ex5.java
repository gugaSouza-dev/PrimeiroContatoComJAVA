package EstruturaDeDesisao;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor um: ");
        int num1 = Integer.parseInt(leitor.nextLine());
        System.out.print("Digite o valor dois: ");
        int num2 = Integer.parseInt(leitor.nextLine());

        if (num1 > num2)
            System.out.print(num1);
        else if (num1 < num2)
            System.out.print(num2);
        else
            System.out.println(num2);
    }
}
