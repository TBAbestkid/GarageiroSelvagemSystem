import controller.CadastroController;
import controller.DeleteController;
import controller.EdicaoController;
import controller.ListController;
import controller.SellingController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Veiculo;

public class Main {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        List<List<Veiculo>> listaDeListas = new ArrayList<>();
        CadastroController cadastroController = new CadastroController(); 
        ListController listController = new ListController(listaDeListas);
        DeleteController deleteController = new DeleteController();
        SellingController sellingController = new SellingController();
        EdicaoController edicaoController = new EdicaoController();

        Scanner scanner = new Scanner(System.in);
        boolean menuAtivo = true; 
        while (menuAtivo) {
            System.out.println("""
                                Menu
                                =============
                                1. - Cadastro
                                2. - Edição
                                3. - Exclusão
                                4. - Listagem
                                5. - Vender
                                6. - Sair
                                """);
            if (scanner.hasNextInt()) {
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1 -> {
                        List<Veiculo> cadastros = cadastroController.MenuCadastro();
                        listaDeListas.add(cadastros);
                    } 

                    case 2 -> {
                        listaDeListas = edicaoController.MenuEdicao(listaDeListas);
                    }

                    case 3 -> {
                        listaDeListas = deleteController.MenuDelete(listaDeListas);
                    }
                    
                    case 4 -> {
                        listController.MenuList(); 
                    }
                    case 5 ->{
                        listaDeListas = sellingController.MenuSell(listaDeListas);

                    }
                    case 6 -> {
                        System.out.println("Saindo do sistema...");
                        menuAtivo = false;
                    }

                    default -> System.out.println("Opção inválida");
                }
            } else {
                System.out.println("Entrada inválida, por favor insira um número.");
                scanner.next();
        }
    }
 }
}