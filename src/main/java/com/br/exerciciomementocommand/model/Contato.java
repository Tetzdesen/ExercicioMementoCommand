package com.br.exerciciomementocommand.model;

/**
 *
 * @author tetzner
 */
public class Contato {
    private String nome;
    private String celular;
    private String email;

    public Contato(String nome, String celular, String email) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }
    
    public MementoContato criar(){
        return new MementoContato(nome, celular, email);
    }
    
    public void restaurar(MementoContato memento){
        this.nome = memento.getNome();
        this.celular = memento.getCelular();
        this.email = memento.getEmail();
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", celular=" + celular + ", email=" + email + '}';
    }
    
    
}
