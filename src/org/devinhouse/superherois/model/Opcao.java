package org.devinhouse.superherois.model;

public enum Opcao {
    CADASTRAR_HEROI,
    CADASTRAR_VILAO,
    LISTAR,
    SAIR;


    public static Opcao converter(int codigo) throws IllegalArgumentException {
        if (codigo == 0 || codigo > 4)
            throw new IllegalArgumentException("Opcao invalida!");
        return Opcao.values()[codigo - 1];
    }
}
