import controller.CadastroController;
import controller.ListController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Veiculo;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = new ArrayList<>();

        CadastroController cadastroController = new CadastroController(); 
        ListController listController = new ListController();

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
                                5. - Sair
                                """);
            if (scanner.hasNextInt()) {
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:

                        cadastroController.MenuCadastro();
                        break;

                    case 2:
                        System.out.println("Edição");
                        break;

                    case 3:
                        System.out.println("Exclusão");
                        break;
                    
                    case 4:
                    
                        listController.MenuList();
                        break;

                    case 5:
                        System.out.println("Saindo do sistema...");
                        menuAtivo = false;
                        break;

                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } else {
                System.out.println("Entrada inválida, por favor insira um número.");
                scanner.next();
        }
    }
 }
}