package candidatura;

import java.util.Scanner;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        int primeiroParametro = lerInteiro("Digite o primeiro par�metro:");
        int segundoParametro = lerInteiro("Digite o segundo par�metro:");

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
            System.out.println("Entrada inv�lida. Por favor, digite um n�mero inteiro.");
            scanner.next(); // Limpa o buffer
        }
        return scanner.nextInt();
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro.");
        }

        for (int i = parametroUm + 1; i <= parametroDois; i++) {
            System.out.println("Imprimindo o n�mero " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
