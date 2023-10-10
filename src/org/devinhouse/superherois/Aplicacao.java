package org.devinhouse.superherois;

import org.devinhouse.superherois.cli.Display;
import org.devinhouse.superherois.model.Heroi;
import org.devinhouse.superherois.model.Opcao;
import org.devinhouse.superherois.model.Personagem;
import org.devinhouse.superherois.model.Vilao;
import org.devinhouse.superherois.repository.PersonagemRepository;

import java.util.List;

public class Aplicacao {
    private Display display = new Display();
    private PersonagemRepository personagemRepository = new PersonagemRepository();

    public void executar() {
        Opcao opcao = null;
        do {
            display.exibirMenu();
            int codigo = display.obterOpcao();
            try {
                opcao = Opcao.converter(codigo);
                processar(opcao);
            } catch (IllegalArgumentException e) {
                display.exibirMensagem(e.getMessage());
            }
        } while (opcao != Opcao.SAIR);
    }

    private void processar(Opcao opcao) {
        if (opcao == Opcao.SAIR)
            return;
        if (opcao == Opcao.CADASTRAR_HEROI) {
            Heroi heroi = display.obterDadosHeroi();
            personagemRepository.inserir(heroi);
        } else if (opcao == Opcao.CADASTRAR_VILAO) {
            Vilao vilao = display.obterDadosVilao();
            personagemRepository.inserir(vilao);
        } else if (opcao == Opcao.LISTAR) {
            List<Personagem> personagens = personagemRepository.listar();
            display.listar(personagens);
        }
    }
}
