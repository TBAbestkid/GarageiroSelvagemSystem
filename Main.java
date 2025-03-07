import java.util.Scanner;
import controller.CadastroController;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menuAtivo = true;
        while (menuAtivo) {
            System.out.println("""
                                Menu
                                ====
                                1. - Cadastro
                                2. - Sair
                                """);
            if (scanner.hasNextInt()) {
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:
                        CadastroController cadastroController = new CadastroController();
                        cadastroController.MenuCadastro();
                        break;
                    case 2:
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