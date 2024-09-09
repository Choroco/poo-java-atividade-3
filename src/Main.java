import Funcionario.funcionario;

public class Main {
    public static void main(String[] args) {
        funcionario joao = new funcionario("Joao Pedro Formentini", 6000, 1000);
        funcionario gabriel = new funcionario("Gabriel Gomes", 10000, 1000);

        gabriel.imprimir_informacoes();
        gabriel.aumentarsalario(30);
    }
}