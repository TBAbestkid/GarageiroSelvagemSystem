package controller;

import view.CadastroView;

public class CadastroController {
    
    private final CadastroView cadastroView;

    public CadastroController() {
        this.cadastroView = new CadastroView();
    }

    public void MenuCadastro()
    {
        cadastroView.MenuCadastro();
    }
}
