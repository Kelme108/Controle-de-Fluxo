import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Leitura dos parâmetros
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Substituir ?? por nextInt()
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Substituir ?? por nextInt()

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) { // Substituir ? por ParametrosInvalidosException
            // Imprimir a mensagem de exceção personalizada
            System.out.println(exception.getMessage()); // Imprimir a mensagem da exceção
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é maior que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}