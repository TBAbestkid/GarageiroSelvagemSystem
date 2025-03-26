package controller;

import java.util.List;
import model.Veiculo;
import view.DeleteView;

public class DeleteController {

    // Agregação: DeleteController mantém uma instância de DeleteView
    private final DeleteView deleteView;

    public DeleteController() {
        this.deleteView = new DeleteView();
    }

    // Método que chama a view para exibir o menu de exclusão de veículos
    public List<List<Veiculo>> MenuDelete(List<List<Veiculo>> listaDeListas) {
        return deleteView.MenuDelete(listaDeListas);
    }
}
