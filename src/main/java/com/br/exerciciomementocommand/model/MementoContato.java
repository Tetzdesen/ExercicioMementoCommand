package com.br.exerciciomementocommand.model;

/**
 *
 * @author tetzner
 */
public class MementoContato {
    private String nome;
    private String celular;
    private String email;

    MementoContato(String nome, String celular, String email) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
    }

    String getNome() {
        return nome;
    }

    String getCelular() {
        return celular;
    }

    String getEmail() {
        return email;
    }
    
    

    
}
