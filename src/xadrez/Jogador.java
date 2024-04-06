package xadrez;

import java.util.Scanner; // Classe que permite o usuário digitar
import java.util.UUID;     // Classe que vai gerar o Id aleatório

public class Jogador {
    private String nome;    //Atributo Nome
    private UUID id;        //Atributo Id

    public Jogador() {                              // Construtor:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do jogador: ");
        this.nome = scanner.nextLine();  // Vai guardar o nome digitado
        this.id = UUID.randomUUID();  // Vai Gerar um ID único e aleatório
    }

    public String getNome() {           // Getter para o nome
        return nome;
    }

    public void setNome(String nome) {      //Setter para o nome
        this.nome = nome;
    }

    public UUID getId() {                // Getter para o ID
        return id;
    }

    public void setId(UUID id) {        //Setter para o Id
        this.id = id;
    }

}

