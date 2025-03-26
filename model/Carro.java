package model;

// A classe Carro herda de Veiculo, seguindo o princípio da herança
public class Carro extends Veiculo {

    // Construtor que recebe todos os atributos de um veículo e os repassa para a
    // superclasse
    public Carro(String marca, String modelo, int ano, String cor, double kmRodado, double valorVendaVeiculo,
            double valorFipeVeiculo, VeiculoDesc descOpcional, boolean vendido) {
        super(marca, modelo, ano, cor, kmRodado, valorVendaVeiculo, valorFipeVeiculo, descOpcional, vendido);
    }

    // Construtor vazio para permitir a criação de um objeto sem parâmetros
    public Carro() {
    }

    // Sobrescrita do método toString para exibir informações do carro formatada
    @Override
    public String toString() {
        return String.format("""
                Carro:
                Marca: %s
                Modelo: %s
                Ano: %d
                Cor: %s
                Quilometragem rodado: %.2f km
                Valor de venda: R$ %.2f
                Valor FIPE: R$ %.2f
                %s
                """, getMarca(), getModelo(), getAno(), getCor(), getKmRodado(), getValorVendaVeiculo(),
                getValorFipeVeiculo(),
                getDescOpcional() != null ? getDescOpcional().toString() : "Sem descrição opcional");
    }
}