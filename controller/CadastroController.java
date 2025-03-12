package controller;

import java.util.List;
import model.Veiculo;
import view.CadastroView;

public class CadastroController {
    
    private final CadastroView cadastroView;

    public CadastroController() {
        this.cadastroView = new CadastroView();
    }

    public List<Veiculo> MenuCadastro()
    {
         return cadastroView.MenuCadastro();
    }
}
