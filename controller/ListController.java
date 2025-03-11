package controller;

import view.ListView;

public class ListController {
    
    private final ListView listView;

    public CadastroController() {
        this.listView = new ListView();
    }

    public void MenuList()
    {
        listView.MenuList();
    }
}
