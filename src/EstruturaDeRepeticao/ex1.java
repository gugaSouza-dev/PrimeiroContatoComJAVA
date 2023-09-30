package EstruturaDeRepeticao;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String email;
        String senha;

        do
        {
            System.out.print("Digite seu email: ");
            email = leitor.nextLine();
            System.out.print("Digite sua senha: ");
            senha = leitor.nextLine();

            if (email.equals("admin") && senha.equals("senha123"))
                System.out.println("Login bem-sucedido");
            else
                System.out.println("Nome do usuário ou senha incorreta.");
        } while (!email.equals("admin") && !senha.equals("senha123"));
    }
}
