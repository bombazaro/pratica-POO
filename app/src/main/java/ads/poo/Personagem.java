package ads.poo;

import org.w3c.dom.ls.LSOutput;

public class Personagem {
    private int forca;
    private int vida;
    private String arma;

    public void atribuirForca(int f){
        this.forca=f;
    }

    public int valorForca(){
        return forca;
    }

    public void atribuirVida(int v){
        this.vida=v;
    }

    public int valorVida(){
        return vida;
    }

    public void atribuirArma(String a){
        this.arma=a;
    }

    public String nomeArma(){
        return arma;
    }
}
