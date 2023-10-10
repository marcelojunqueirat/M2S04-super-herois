package org.devinhouse.superherois.model;

public class Heroi extends Personagem {
    private String nomeVidaReal;

    public Heroi(String nome, String superpoder, String nomeVidaReal) {
        this.setNome(nome);
        this.setSuperpoder(superpoder);
        this.nomeVidaReal = nomeVidaReal;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }
}
