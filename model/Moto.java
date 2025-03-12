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

    @Override
    public String toString(){
        return String.format("""
            Moto
            Marca: %s
            Modelo: %s
            Ano: %d
            Cor: %s
            Quilometragem rodado: %.2f km
            Valor de venda: R$ %.2f
            Valor FIPE: R$ %.2f
            %s
            """, getMarca(), getModelo(), getAno(), getCor(), getKmRodado(), getValorVendaVeiculo(), getValorFipeVeiculo(), getDescOpcional() != null ? getDescOpcional().toString() : "Sem descrição opcional");    
    }

}
