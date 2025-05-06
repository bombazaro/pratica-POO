package ads.poo;

import org.checkerframework.checker.builder.qual.CalledMethods;
import org.checkerframework.checker.units.qual.C;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) {

        //CONTADOR
        Contador primeiro = new Contador();

        System.out.println("contador");
        primeiro.atribuirValor(5);
        primeiro.incrementar();
        System.out.println(primeiro.obter());

        //PERSONAGEM
        Personagem mello = new Personagem();

        System.out.println("\n Personagem");
        mello.atribuirForca(100);
        mello.atribuirVida(100);
        mello.atribuirArma("Espada");

        System.out.println(mello.valorForca());
        System.out.println(mello.valorVida());
        System.out.println(mello.nomeArma());

        //BATEDEIRA
        VendaDeBatedeira primeiraBatedeira = new VendaDeBatedeira();

        System.out.println("\n Batedeira");
        primeiraBatedeira.definirCor("Vermelha");
        primeiraBatedeira.definirMarca("Agratto");
        primeiraBatedeira.definirPreco(474.84);

        System.out.println(primeiraBatedeira.obterCor());
        System.out.println(primeiraBatedeira.obterMarca());
        System.out.println(primeiraBatedeira.obterPreco());

        //DISCIPLINA
        Disciplina poo = new Disciplina("POO", "Progranação Orientada a Objeto", "POO786202");

        System.out.println("\n Disciplina");
        System.out.println(poo);

        //CANETA
        System.out.println("\n Caneta");
        Caneta a = new Caneta();

        System.out.println(a.desenhar(5));
        System.out.println(a.desenhar(5, "="));

        //CARRO
        System.out.println("\n Carro");

        Carro b = new Carro();
        System.out.println(b.getContador());

        Carro c = new Carro();
        System.out.println(c.getContador());
    }
}
