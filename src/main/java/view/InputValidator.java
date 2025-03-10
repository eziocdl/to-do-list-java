package view;

public class InputValidator {

    // validando as entradas

    public boolean stringNaoVazia(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public boolean inteiroValido(String input) {
        try {
            Integer.parseInt(input);
            return true;

        } catch(NumberFormatException e) {
            return false;

        }
    }

    public boolean opcaoMenuValida(int opcao, int min, int max) {
        return opcao >= min && opcao <= max;
    }
}
