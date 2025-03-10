package view;

import java.util.List;

public class OutputHandler {

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirListaTarefas(ListaTarefas listaTarefas) {
        System.out.println("\nLista de Tarefas:");

        // exibindo a lista de tarefas de acordo com o que estiver listado
        // esse loop será usado um for-each para iterar sobre a lista de tarefaz

        List<String> tarefas = listaTarefas.getListaTarefas();
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            // contador para exibir o número de tarefas
            int numero = 1;

            for(String tarefa : tarefas) {
                // formatação mais elegante
                System.out.printf("%d. %s%n", numero++, tarefa);
            }
        }

        }

}
