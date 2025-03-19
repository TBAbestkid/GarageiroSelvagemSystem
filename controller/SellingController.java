package controller;

import java.util.List;
import model.Veiculo;
import view.SellView;

public class SellingController {
    
    private final SellView sellview;

    public SellingController(){
        this.sellview = new SellView();
    }
    
    public List<List<Veiculo>> MenuSell(List<List<Veiculo>> listaDeListas) {
        return sellview.MenuSell(listaDeListas);
    }
}
