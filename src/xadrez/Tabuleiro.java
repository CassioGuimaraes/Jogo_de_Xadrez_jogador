package xadrez;
public class Tabuleiro {
    private String[][] casa;        //Atributo Casa

    public Tabuleiro() {                // Construtor:
        this.casa = new String[8][8];   //Definindo dois vetores de tamanho 8 para a representação da matriz
        inicializarTabuleiro();         //Método criado como suporte para inicializar o tabuleiro (Privado)
    }

    public String getCasa(int x, int y) {       //Getter do atributo casa.
        return casa[x][y];
    }

    public void setCasa(int x, int y, String valor) {       //Setter do atributo casa.
        casa[x][y] = valor;
    }

    private void inicializarTabuleiro() {          // Método privado que vai inicializar o tabuleiro com
                                                    // as peças de xadrez nos lugares corretos(Representação Gráfica).


        for (int i = 0; i < casa.length; i++) {          // Adição da representação dos peões como a letra P.
            casa[1][i] = "P"; // Peões do jogador 1
            casa[6][i] = "P"; // Peões do jogador 2
        }

        String[] pecas = {"T", "C", "B", "D", "R", "B", "C", "T"};      // Vetor criado tendo o objetivo de adicionar letras posteriormente.
        for (int i = 0; i < casa.length; i++) {                 //Adição da representação da Torre=T, Cavalo=C, Bispo=B, Dama=D e Rei=R.
            casa[0][i] = pecas[i]; // Peças principais do jogador 1
            casa[7][i] = pecas[i]; // Peças principais do jogador 2
        }


        for (int i = 2; i <= 5; i++) {      //  Vai adicionar um espaço vazio nas demais casas
            for (int j = 0; j < casa.length; j++) {
                casa[i][j] = " ";
            }
        }
    }
    public void imprimirTabuleiro() {               // Método para imprimir o tabuleiro com identificações
        System.out.print("  ");
        for (char letra = 'A'; letra <= 'H'; letra++) { // Preencher linha com letras(A até H)
            System.out.print(" " + letra);
        }
        System.out.println();
        System.out.println("  -----------------");


        for (int i = 0; i < casa.length; i++) {     //// Preencher a coluna com números(1 até 8)
            System.out.print((i + 1) + "-");
            for (int j = 0; j < casa[i].length; j++) {
                System.out.print("|" + casa[i][j]);
            }
            System.out.println("|-" + (i + 1));
        }

        System.out.print("  ");
        System.out.println("-----------------");
        System.out.print("  ");
        for (char letra = 'A'; letra <= 'H'; letra++) {     // Preencher linha com letras(A até H)
            System.out.print(" " + letra);
        }
    }

}

