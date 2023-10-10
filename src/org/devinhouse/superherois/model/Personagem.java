package org.devinhouse.superherois.model;

import java.util.Objects;

public abstract class Personagem implements Comparable<Personagem> {
    private String nome;
    private String superpoder;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem outro = (Personagem) o;
        return Objects.equals(this.nome, outro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int compareTo(Personagem personagem) {
        return this.getNome().compareTo(personagem.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }
}
