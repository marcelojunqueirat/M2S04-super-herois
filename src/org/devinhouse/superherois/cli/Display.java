package org.devinhouse.superherois.cli;

import org.devinhouse.superherois.model.Heroi;
import org.devinhouse.superherois.model.Personagem;
import org.devinhouse.superherois.model.Vilao;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Display {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public void exibirMenu() {
        System.out.println(ANSI_BLUE + "** MENU DE CADASTRO DE SUPER HEROIS E VILOES **" + ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_CYAN + "1 - Cadastrar Herói");
        System.out.println("2 - Cadastrar Vilão");
        System.out.println("3 - Listar");
        System.out.println("4 - Sair" + ANSI_RESET);
        System.out.println();
    }

    public int obterOpcao() {
        System.out.println("Informe a opção desejada:");
        Scanner scanner = new Scanner(System.in);
        try {
            int op = scanner.nextInt();
            return op;
        } catch (InputMismatchException e) {
            return -1;
        }
    }

    public void exibirMensagem(String mensagem) {
        System.out.println();
        System.out.println("==> " + mensagem);
        System.out.println();
    }

    public Heroi obterDadosHeroi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_CYAN + "Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o superpoder: ");
        String superpoder = scanner.nextLine();
        System.out.println("Informe o nome na vida real: " + ANSI_RESET);
        String nomeVidaReal = scanner.nextLine();
        return new Heroi(nome, superpoder, nomeVidaReal);
    }

    public Vilao obterDadosVilao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_RED + "Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o superpoder: ");
        String superpoder = scanner.nextLine();
        System.out.println("Informe o tempo de prisão(em anos): "  + ANSI_RESET);
        int tempoPrisao = scanner.nextInt();
        return new Vilao(nome, superpoder, tempoPrisao);
    }

    public void listar(List<Personagem> personagens) {
        Collections.sort(personagens);
        System.out.println(ANSI_GREEN + "Listando...");
        personagens.forEach(System.out::println);
        System.out.println(ANSI_RESET);
    }
}
