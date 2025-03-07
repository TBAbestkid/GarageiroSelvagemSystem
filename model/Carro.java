package model;

public class Carro extends Veiculo{
    
    public Carro(String marca, String modelo, int ano, String cor, double kmRodado, double valorVendaVeiculo, double valorFipeVeiculo, VeiculoDesc descOpcional, boolean vendido)
    {
        super(marca, modelo, ano, cor, kmRodado, valorVendaVeiculo, valorFipeVeiculo, descOpcional, vendido);
    }

    public Carro() {
    }
    
}