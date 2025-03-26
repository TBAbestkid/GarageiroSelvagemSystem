package controller;

import java.util.List;
import model.Veiculo;
import view.CadastroView;

public class CadastroController {

    // Agregação: CadastroController precisa de um CadastroView
    // mas não o cria dentro de um método

    private final CadastroView cadastroView;

    public CadastroController() {
        // A instância do CadastroView é passada para este controller
        this.cadastroView = new CadastroView();
    }

    // Método que chama a view para exibir
    // menu de cadastro e retorna a lista de veículos cadastrados
    public List<Veiculo> MenuCadastro() {
        return cadastroView.MenuCadastro();
    }
}
