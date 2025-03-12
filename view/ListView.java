package view;

import java.util.List;
import model.Veiculo;

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
