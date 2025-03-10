package view;

import java.util.Scanner;

public class InputHandler {

    // Classe responsável por lidar com a entrada dos dados do usuário


    private Scanner scanner;
    private InputValidator validator;

    // construtor é um método especial chamado quando um objeto dessa classe for criado ou instanciado em outra classe
    public  InputHandler() {
        // leitura da entrada
        this.scanner = new Scanner(System.in);
        this.validator = new InputValidator();
    }

    public String lerString(String mensagem) {
        System.out.println(mensagem);
        String input;
        while (true) {
            input = scanner.nextLine();
            if (validator.stringNaoVazia(input)) {
                break;
            } else {
                System.out.println("Entrada inválida. Digite uma string não vazia.");
                // Repete a mensagem
                System.out.println(mensagem);
            }
        }
        return input;
    }

    public int lerInteiro(String mensagem) {
        // aceita uma chamada String e retorna um número inteiro
        // Essa chamada ao método genérico passando uma mensagem e uma ref ao método validarInteiro
        // usa o input Validator

            System.out.println(mensagem);
            while (true) {
                String input = scanner.nextLine();
                try {
                    int numero = Integer.parseInt(input);
                    return numero;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Digite um número inteiro.");
                    System.out.println(mensagem);
                }
            }

    }


    // Método genérico de ler entradas
    private int lerEntrada(String mensagem, Validacao validacao) {
        System.out.println(mensagem);

        while (true) {

            String input = scanner.nextLine(); // Correção: ler a linha inteira
            if (validacao.isValido()) {
                try {
                    return Integer.parseInt(input); // Converter a linha inteira
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Digite um número inteiro.");
                    System.out.println(mensagem);
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                System.out.println(mensagem);
            }
        }
    }

    private boolean validarInteiro() {
        return scanner.hasNextInt();
    }

    public void fecharScanner() {
        scanner.close();
    }

    @FunctionalInterface
    interface Validacao{
        boolean isValido();
    }
}
