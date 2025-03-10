package controller;

import model.ListaTarefas;
import view.InputHandler;
import view.Menu;
import view.OutputHandler;


public class Controller {

    private ListaTarefas listaTarefas;
    private Menu menu;
    private InputHandler inputHandler;
    private OutputHandler outputHandler;


    public Controller() {
        listaTarefas = new ListaTarefas();
        menu = new Menu();
        inputHandler = new InputHandler();
        outputHandler = new OutputHandler();

        listaTarefas.adicionarObservador(outputHandler); // Registra o OutputHandler como observador
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = menu.exibirMenuPrincipal();
            processarOpcao(opcao);
        } while (opcao != 4); // Opção 4 é "sair"
        menu.fecharScanner();
        inputHandler.fecharScanner();
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1: // Adicionar tarefa
                adicionarTarefa();
                break;
            case 2: // Remover tarefa
                removerTarefa();
                break;
            case 3: // Listar tarefas
                listarTarefas();
                break;
            case 4: // Sair
                outputHandler.exibirMensagem("Saindo...");
                break;
            default:
                outputHandler.exibirMensagem("Opção inválida.");
        }
    }

    private void adicionarTarefa() {
        String descricao = inputHandler.lerString("Digite a descrição da tarefa: ");
        listaTarefas.adicionarTarefa(descricao);
        outputHandler.exibirMensagem("Tarefa adicionada com sucesso.");
    }

    private void removerTarefa() {
        int indice = inputHandler.lerInteiro("Digite o índice da tarefa a ser removida: ");
        listaTarefas.removerTarefa(indice);
        outputHandler.exibirMensagem("Tarefa removida com sucesso.");
    }
    private void listarTarefas() {
        outputHandler.exibirListaTarefas(listaTarefas);
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.iniciar();
    }
}