package com.br.exerciciomementocommand.command;

import com.br.exerciciomementocommand.model.Contato;

/**
 *
 * @author tetzner
 */
public interface IContatoCommand {
    void executar(Contato contato);
    void desfazer();
}
