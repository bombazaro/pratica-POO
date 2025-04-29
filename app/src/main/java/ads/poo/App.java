package ads.poo;

import org.checkerframework.checker.units.qual.C;

public class App {
    public static void main(String[] args) {
        Contador primeiro = new Contador();

        System.out.println("contador");
        primeiro.atribuirValor(5);
        primeiro.incrementar();
        System.out.println(primeiro.obter());

        Personagem mello = new Personagem();

        System.out.println("\n Personagem");
        mello.atribuirForca(100);
        mello.atribuirVida(100);
        mello.atribuirArma("Espada");

        System.out.println(mello.valorForca());
        System.out.println(mello.valorVida());
        System.out.println(mello.nomeArma());

        VendaDeBatedeira primeiraBatedeira = new VendaDeBatedeira();

        System.out.println("\n Batedeira");
        primeiraBatedeira.definirCor("Vermelha");
        primeiraBatedeira.definirMarca("Agratto");
        primeiraBatedeira.definirPreco(474.84);

        System.out.println(primeiraBatedeira.obterCor());
        System.out.println(primeiraBatedeira.obterMarca());
        System.out.println(primeiraBatedeira.obterPreco());

        Disciplina poo = new Disciplina("POO", "Progranação Orientada a Objeto", "POO786202");

        System.out.println("\n Disciplina");
        System.out.println(poo);
    }
}
