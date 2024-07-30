package candidatura;

import java.util.Scanner;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        int primeiroParametro = lerInteiro("Digite o primeiro parâmetro:");
        int segundoParametro = lerInteiro("Digite o segundo parâmetro:");

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static int lerInteiro(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            scanner.next(); // Limpa o buffer
        }
        return scanner.nextInt();
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        for (int i = parametroUm + 1; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
