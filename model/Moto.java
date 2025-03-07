package model;

public class Moto extends Veiculo {
    
    public Moto(String marca, String modelo, int ano, String cor, double kmRodado, double valorVendaVeiculo, double valorFipeVeiculo, VeiculoDesc descOpcional, boolean vendido)
    {
        super(marca, modelo, ano, cor, kmRodado, valorVendaVeiculo, valorFipeVeiculo, descOpcional, vendido);
    }

    public Moto()
    {
        super();
    }
}
