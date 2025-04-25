package ads.poo;

public class Contador {
    private int valorAtual;

    public void atribuirValor(int v){
        this.valorAtual=v;
    }

    public void incrementar(){
        valorAtual++;
    }

    public int obter() {
        return valorAtual;
    }
}
