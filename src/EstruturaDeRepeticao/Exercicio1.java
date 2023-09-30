package EstruturaDeRepeticao;

public class Exercicio1 {

    public static String mensagem(String professor, String parOuImpar) {
        return ("O número do índice do(a) do professor(a) " + professor + "é " + parOuImpar + "\n");
    }
    public static void main(String[] args) {
        String[] listaProfessores = {"Alexia", "Odirlei", "Jessica", "Thiago", "Samanta" };

        for (int i = 0; i < listaProfessores.length; i++) {
            if (i == 0)
                System.out.printf(mensagem(listaProfessores[i], "par"));
            else if (i % 2 == 0)
                System.out.printf(mensagem(listaProfessores[i], "impar"));
            else
                System.out.printf(mensagem(listaProfessores[i], "par"));

        }
    }
}
