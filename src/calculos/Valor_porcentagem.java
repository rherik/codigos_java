package calculos;
import java.util.Scanner;
public class Valor_porcentagem {
        //Função para descobrir a porcentagem que um determinado valor representa de um total
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        double valor;
        double porcentagem;
        double resultado;

        Scanner reader = new Scanner(System.in);

        // Exibição de interface de terminal
        System.out.println("Bem vindx ao calculador de porcentagem em Java!");
        Thread.currentThread().sleep(1000);
        for (int x = 0; x < 5; x++) {
            Thread.currentThread().sleep(1000);
            System.out.println(".");
        }

        // Obtenção dos valores (Entrada)
        System.out.print("Digite o valor a ser calculado: ");
        valor = reader.nextDouble(); // Obtem o input do teclado

        System.out.print("Digite a porcentagem a ser calculada: ");
        porcentagem = reader.nextDouble(); // Obtem o input do teclado

        // Cálculo do resultado
        resultado = (valor * porcentagem) / 100;

        // Exibição do resultado
        System.out.println("\nA porcentagem inserida foi: " + porcentagem + "%"
                + "\nO valor que representa essa porcentagem é = R$" + resultado);
    }
}
