package ads.poo;

public class Caneta {
    private String cor;
    private double nivelTinta;
    private boolean aberta;

    private static final String PONTA_PADRAO = "-";
    private static final double NIVEL_PADRAO = 100;

    public Caneta() {
        this.cor = "Preta";
        this.nivelTinta = NIVEL_PADRAO;
        this.aberta = false;
    }

    public Caneta(String cor) {
        this();
        this.cor = cor;
    }

    public Caneta(String cor, double nivelTinta) {
        this(cor);
        this.nivelTinta = nivelTinta;
    }



    public String desenhar(int quantidade, String ponta){
        return ponta.repeat(quantidade);
    }

    public String desenhar(int quantidade){
        return this.desenhar(quantidade, PONTA_PADRAO);
    }
}
