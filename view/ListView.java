package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Carro;
import model.Moto;
import model.Veiculo;
import model.VeiculoDesc;

public class ListView {

    public void MenuList(List<Veiculo> listaVeiculos) {
        if (listaVeiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            System.out.println("Lista de Veículos: ");
            for (Veiculo veiculo : listaVeiculos) {
                System.out.println(veiculo);  
            }
        }
    }
}
