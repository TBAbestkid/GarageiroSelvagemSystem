import controller.CadastroController;
import java.util.ArrayList;
import java.util.Scanner;
import model.Veiculo;

public class Main {
    public static void main(String[] args) {
        CadastroController cadastroController = new CadastroController();
        ArrayList<Veiculo> veiculos = new ArrayList<>(); 
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
                        System.out.println("");
                        break;
                
                    case 3:
                        System.out.println("Edição");
                        break;

                    case 4:
                        System.out.println("Exclusão");
                        break;
                    
                    case 5:
                        System.out.println("Listagem");
                        break;

                    case 6:
                        System.out.println("Sair");
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