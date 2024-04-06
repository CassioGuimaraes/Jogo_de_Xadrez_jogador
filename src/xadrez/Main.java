package xadrez;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();  // Cria um novo jogador solicitando o nome
        System.out.println("Jogador: " + jogador.getNome() + ", ID: " + jogador.getId());
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.imprimirTabuleiro(); // Imprime o tabuleiro inicializado com as peças
    }
}
