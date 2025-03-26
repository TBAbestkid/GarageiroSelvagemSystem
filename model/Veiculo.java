package model;

// Classe abstrata que define um veículo genérico
public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double kmRodado;
    private double valorVendaVeiculo;
    private double valorFipeVeiculo;

    // Agregação: Veiculo possui um VeiculoDesc, mas não o cria diretamente
    private VeiculoDesc descOpcional;
    private boolean vendido = false;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, int ano, String cor, double kmRodado, double valorVendaVeiculo,
            double valorFipeVeiculo, VeiculoDesc descOpcional, boolean vendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.kmRodado = kmRodado;
        this.valorVendaVeiculo = valorVendaVeiculo;
        this.valorFipeVeiculo = valorFipeVeiculo;
        this.descOpcional = descOpcional;
        this.vendido = vendido;
    }

    // Métodos Getters e Setters para acessar e modificar os atributos

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getKmRodado() {
        return this.kmRodado;
    }

    public void setKmRodado(double kmRodado) {
        this.kmRodado = kmRodado;
    }

    public double getValorVendaVeiculo() {
        return this.valorVendaVeiculo;
    }

    public void setValorVendaVeiculo(double valorVendaVeiculo) {
        this.valorVendaVeiculo = valorVendaVeiculo;
    }

    public double getValorFipeVeiculo() {
        return this.valorFipeVeiculo;
    }

    public void setValorFipeVeiculo(double valorFipeVeiculo) {
        this.valorFipeVeiculo = valorFipeVeiculo;
    }

    public VeiculoDesc getDescOpcional() {
        return this.descOpcional;
    }

    public void setDescOpcional(VeiculoDesc descOpcional) {
        this.descOpcional = descOpcional;
    }

    public boolean isVendido() {
        return this.vendido;
    }

    public boolean getVendido() {
        return this.vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor +
                ", KM Rodado: " + kmRodado + ", Valor de Venda: R$" + valorVendaVeiculo +
                ", Valor FIPE: R$" + valorFipeVeiculo + ", Vendido: " + (vendido ? "Sim" : "Não");
    }

}
