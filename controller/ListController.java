package controller;

import java.util.List;
import model.Veiculo;
import view.ListView;

public class ListController {
    private List<List<Veiculo>> listaDeListas;
    private ListView listView = new ListView();

    public ListController(List<List<Veiculo>> listaDeListas) {
        this.listaDeListas = listaDeListas;
    }

    public void MenuList() {
        listView.MenuList(listaDeListas);
    }
}
