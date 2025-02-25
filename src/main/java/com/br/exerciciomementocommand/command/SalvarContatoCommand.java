package com.br.exerciciomementocommand.command;

import com.br.exerciciomementocommand.model.Contato;
import com.br.exerciciomementocommand.model.MementoContato;
import java.util.List;

/**
 *
 * @author tetzner
 */
public class SalvarContatoCommand implements IContatoCommand {

    private MementoContato memento;
    private List<Contato> contatos;
    private Contato contato;

    public SalvarContatoCommand(List<Contato> contatos) {
        this.contatos = contatos;  
    }

    @Override
    public void executar(Contato contato) {
        this.contato = contato;
        contatos.add(contato);
    }

    @Override
    public void desfazer() {
        contatos.remove(contato);
    }

}
