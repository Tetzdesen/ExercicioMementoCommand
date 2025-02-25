package com.br.exerciciomementocommand.principal;

import com.br.exerciciomementocommand.command.ExcluirContatoCommand;
import com.br.exerciciomementocommand.command.IContatoCommand;
import com.br.exerciciomementocommand.command.SalvarContatoCommand;
import com.br.exerciciomementocommand.model.Contato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tetzner
 */
public class Principal {

    public static void main(String[] args) {

        // Criando contatos para teste
        Contato contato1 = new Contato("Tetzner", "12345", "tetz@email.com");
        Contato contato2 = new Contato("Kaua", "98765", "kaua@email.com");

        // Lista que armazenará os contatos
        List<Contato> contatos = new ArrayList<>();

        // Criando os comandos para salvar e excluir contatos
        IContatoCommand salvarComando = new SalvarContatoCommand(contatos);
        IContatoCommand excluirComando = new ExcluirContatoCommand(contatos);

        // Teste: Salvando o primeiro contato
        salvarComando.executar(contato1);
        System.out.println("Após salvar contato1: " + contatos);

        // Teste: Salvando o segundo contato
        salvarComando.executar(contato2);
        System.out.println("Após salvar contato2: " + contatos);

        // Teste: Excluindo o segundo contato
        excluirComando.executar(contato2);
        System.out.println("Após excluir contato2: " + contatos);

        // Teste: Desfazendo a exclusão do contato2
        excluirComando.desfazer();
        System.out.println("Após desfazer exclusão de contato2: " + contatos);
    }
}
