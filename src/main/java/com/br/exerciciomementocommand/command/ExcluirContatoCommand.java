package com.br.exerciciomementocommand.command;

import com.br.exerciciomementocommand.model.Contato;
import com.br.exerciciomementocommand.model.MementoContato;
import java.util.List;

/**
 *
 * @author tetzner
 */
public class ExcluirContatoCommand implements IContatoCommand {

    private MementoContato memento;
    private List<Contato> contatos;
    private Contato contato;

    public ExcluirContatoCommand(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public void executar(Contato contato) {
        this.contato = contato;
        this.memento = this.contato.criar();
        contatos.remove(contato);
    }

    @Override
    public void desfazer() {
        if (contato == null && memento == null) {
            throw new RuntimeException("Não é possível desfazer");
        }
        this.contato.restaurar(memento);
        contatos.add(contato);
    }

}
