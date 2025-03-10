package model;


import view.ListaTarefasObserver;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private ArrayList<String> listaTarefas;

    // chamando a interface observer
    private List<ListaTarefasObserver> observadores = new ArrayList<>();

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

        public void adicionarObservador(ListaTarefasObserver observador) {
        observadores.add(observador);
        }

        public void removerObservador(ListaTarefasObserver observdor) {
        observadores.remove(observdor);
        }

    public void adicionarTarefa(String tarefa) {
       if(tarefa !=null && !tarefa.trim().isEmpty()) {
           listaTarefas.add(tarefa);
           notificarObservadores();
       } else {
           System.out.println("Tarefa inválida. Tarefa não pode ser vazia.");
       }
    }

    public void removerTarefa(int indice) {
        // Verificação de lista vazia
        if (listaTarefas.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        if (indice > 0 && indice <= listaTarefas.size()) {
            try {
                listaTarefas.remove(indice -1 );
                notificarObservadores();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro ao remover tarefa: índice fora do intervalo.");
            }
        } else {
            System.out.println("Índice inválido. A lista possui " + listaTarefas.size() + " tarefas.");
        }
    }

    public ArrayList<String> getListaTarefas() {
        return listaTarefas;
    }


   private void notificarObservadores() {
        for(ListaTarefasObserver observador: observadores) {
            observador.atualizar(this);
        }
   }
}
