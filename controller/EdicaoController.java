package controller;

import java.util.List;

import model.Veiculo;
import view.EdicaoView;

public class EdicaoController {
    private final EdicaoView edicaoView;

    public EdicaoController(){
        this.edicaoView = new EdicaoView();
    }

    public List<List<Veiculo>> MenuEdicao(List<List<Veiculo>> listaDeListas) {
        return edicaoView.MenuEdicao(listaDeListas);
    }
}
