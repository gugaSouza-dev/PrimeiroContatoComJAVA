package EstruturaDeDesisao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu salário: ");

        double salario = Double.parseDouble(leitor.nextLine());

        if (salario < 1000)
        {
            double salarioReajustado = salario * 1.1;
            System.out.println(salarioReajustado);
        }
        else
            System.out.println("Salário sem reajuste");

        //System.out.print(leitor);
    }
}
