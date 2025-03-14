package controller;

import java.util.List;
import model.Veiculo;
import view.DeleteView;

public class DeleteController {
    
    private final DeleteView deleteView;

    public DeleteController() {
        this.deleteView = new DeleteView();
    }

    public List<List<Veiculo>> MenuDelete(List<List<Veiculo>> listaDeListas) {
         return deleteView.MenuDelete(listaDeListas);
    }
}
