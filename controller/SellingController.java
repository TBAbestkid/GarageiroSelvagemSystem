package controller;

import java.util.List;
import model.Veiculo;
import view.SellView;

public class SellingController {

    // Agregação: SellingController mantém uma referência a SellView
    private final SellView sellview;

    public SellingController() {
        this.sellview = new SellView();
    }

    // Método que chama a View para exibir o menu de venda de veículos
    public List<List<Veiculo>> MenuSell(List<List<Veiculo>> listaDeListas) {
        return sellview.MenuSell(listaDeListas);
    }
}
