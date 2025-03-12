import controller.CadastroController;
import controller.ListController;
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
                    case 1 -> {
                        List<Veiculo> cadastros = cadastroController.MenuCadastro();
                        listaDeListas.add(cadastros);
                    } 

                    case 2 -> System.out.println("Edição");

                    case 3 -> System.out.println("Exclusão");
                    
                    case 4 -> {
                        listController.MenuList(); 
                    }
                    case 5 -> {
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