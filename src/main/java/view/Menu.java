package view;

import java.util.Scanner;

public class Menu {

    // Criando o Menu para o usuário poder interagir

    private Scanner scanner;

    // inputValidator adicionado
    private InputValidator validator;

    // Opções do Menu foram definidas como constantes

    private static final int ADICIONAR_TAREFA = 1;
    private static final int REMOVER_TAREFA = 2;
    private static final int LISTAT_TAREFAS = 3;

    private static final int SAIR = 4;

    // constructor vazio iniciando o scanner como um novo objeto
    public Menu() {

        this.scanner = new Scanner(System.in);
        // incializando o inputValidator no Constructor
        this.validator = new InputValidator();
    }


    /**
     * Exibe o menu principal e obtém uma opção válida do usuário.
     * A lógica de exibição das opções do menu foi extraída para o método
     * 'exibirOpcoesMenu()' para melhorar a coesão e a legibilidade.
     *
     * @return A opção escolhida pelo usuário.
     * <p>
     * Essa estrutura é chamada de composição de métodos
     */
    public int exibirMenuPrincipal() {
        exibirOpcoesMenu();
        return obterOpcaoValida();
    }

    // metodo para exibir o menu principal

    private void exibirOpcoesMenu() {
        System.out.println("\n---Lista de Tarefas---");
        System.out.print("Escolha uma opção:");
        System.out.println(ADICIONAR_TAREFA + ". Adicionar uma tarefa");
        System.out.println(REMOVER_TAREFA + ". Remover tarefa");
        System.out.println(LISTAT_TAREFAS + ". Listar tarefas");
        System.out.println(SAIR + ". Sair");

    }


    private int obterOpcaoValida() {
        int opcao;
        while (true) {
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                if (validator.opcaoMenuValida(opcao, ADICIONAR_TAREFA, SAIR)) {
                    break;
                } else {
                    System.out.println("Opção inválida! Digite um número entre " + ADICIONAR_TAREFA + " e " + SAIR + ".");
                    System.out.print("Escolha uma opção: "); // Repete o prompt
                }
            } else {
                System.out.println("Opção inválida! Digite um número.");
                scanner.next();
                System.out.print("Escolha uma opção: "); // Repete o prompt
            }
            scanner.nextLine(); // Limpa o buffer do scanner
        }
        return opcao;
    }

    public void fecharScanner() {
        scanner.close();
    }
}

