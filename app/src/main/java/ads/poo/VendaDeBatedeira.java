package ads.poo;

public class VendaDeBatedeira {
    private String cor;
    private double preco;
    private String marca;

    public void definirCor(String c){
        this.cor=c;
    }

    public String obterCor(){
        return cor;
    }

    public void definirPreco(double p){
        this.preco=p;
    }

    public double obterPreco(){
        return preco;
    }

    public void definirMarca(String m){
        this.marca=m;
    }

    public String obterMarca(){
        return marca;
    }
}
