package EstruturaDeRepeticao;

import java.util.concurrent.TimeUnit;

public class Exemplo3 {
    public static void main(String[] args) throws InterruptedException {
        String[] carros = {"El Camino", "Toyota Sprinter Trueno", "Mustang 69", "Jaguar E-Type 1961"};

        for (String carro : carros)
        {
            System.out.println(carro);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
