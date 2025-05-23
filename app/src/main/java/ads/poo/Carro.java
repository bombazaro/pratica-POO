package ads.poo;

public class Carro {

    private static int contador;

    private double velocidadeAtual;
    private String modelo;
    private static final double VELOCIDADE_MAXIMA = 200;
    private static final String MODELO_PADRAO = "Fusca";

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;

        contador++;
    }

    public Carro() {
        this(MODELO_PADRAO);
    }

    public static int getContador() {
        return contador;
    }
}