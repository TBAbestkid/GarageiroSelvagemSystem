package controller;

import java.util.List;
import model.Veiculo;
import view.ListView;

public class ListController {

    // Lista de listas de veículos, permitindo gerenciar múltiplos grupos de
    // veículos
    private List<List<Veiculo>> listaDeListas;

    // Agregação: ListController mantém uma referência a ListView
    private ListView listView = new ListView();

    public ListController(List<List<Veiculo>> listaDeListas) {
        this.listaDeListas = listaDeListas;
    }

    // Método que chama a View para exibir a lista de veículos
    public void MenuList() {
        listView.MenuList(listaDeListas);
    }
}
