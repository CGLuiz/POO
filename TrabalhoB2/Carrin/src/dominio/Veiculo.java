package dominio;

public class Veiculo {
    private int codigo;
    private String marca;
    private String modelo;
    private int AnoFabricacao;
    private double preco;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoFabricacao() {
        return AnoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        AnoFabricacao = anoFabricacao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Veiculo(){
    }

    public Veiculo(int codigo, String marca, String modelo, int AnoFabricacao, double preco){
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.AnoFabricacao = AnoFabricacao;
        this.preco = preco;
    }

}