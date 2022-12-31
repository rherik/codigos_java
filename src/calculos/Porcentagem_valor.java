package calculos;
import java.util.Scanner;
public class Porcentagem_valor {
    // A função retorna uma porcentagem após o usuário inserir o montante total e o valor do qual ele quer descobrir a porcentagem  
    public static void main(String[] args) throws Exception {
        //Declaração de variáveis
        double valor_total;
        double valor_secundario;
        double resultado;

        Scanner reader = new Scanner(System.in);

        //Exibição de interface de terminal
        System.out.println("Bem vindx ao calculador de porcentagem em Java!");
        System.out.println("Diga o valor total e o valor que você quer descobrir a porcentagem.");
        Thread.currentThread().sleep(1000);
        for (int x = 0; x < 5; x++) {
            Thread.currentThread().sleep(1000);
            System.out.println(".");
        }

        //Obtenção dos valores (Entrada)
        System.out.print("Digite o valor total: R$");
        valor_total = reader.nextDouble(); //Obtem valor em reais que representa 100%

        System.out.print("Digite o valor que você quer descobrir a porcentagem: R$");
        valor_secundario = reader.nextDouble(); //Obtem o valor que quer descobrir a porcentagem

        //Cálculo do resultado
        resultado = (valor_secundario * 100) / valor_total;

        //Exibir resultado
        System.out.println("\nO valor: R$" + valor_secundario + " representa " + resultado + "%" + " do valor total de R$" + valor_total);
    }
}
