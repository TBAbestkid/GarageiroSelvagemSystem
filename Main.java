import controller.CadastroController;
import controller.DeleteController;
import controller.ListController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Carro;
import model.Moto;
import model.Veiculo;
import model.VeiculoDesc;

public class Main {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        List<List<Veiculo>> listaDeListas = new ArrayList<>();
        CadastroController cadastroController = new CadastroController(); 
        ListController listController = new ListController(listaDeListas);
        DeleteController deleteController = new DeleteController();

        List<Veiculo> listaCarros = new ArrayList<>();
        listaCarros.add(new Carro("Toyota", "Corolla", 2019, "Prata", 50000.0, 70000.0, 68000.0, new VeiculoDesc(true, true, "ABC-1234"), false));
        listaCarros.add(new Carro("Honda", "Civic", 2020, "Preto", 30000.0, 80000.0, 75000.0, new VeiculoDesc(true, false, "DEF-5678"), false));

        List<Veiculo> listaMotos = new ArrayList<>();
        listaMotos.add(new Moto("Yamaha", "MT-07", 2021, "Azul", 12000.0, 30000.0, 28000.0, new VeiculoDesc(false, false, "GHI-9012"), false));
        listaMotos.add(new Moto("Kawasaki", "Ninja", 2018, "Verde", 15000.0, 35000.0, 33000.0, new VeiculoDesc(false, false, "JKL-3456"), false));

        // Adiciona as listas criadas à lista de listas principal
        listaDeListas.add(listaCarros);
        listaDeListas.add(listaMotos);

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

                    case 3 -> {
                        listaDeListas = deleteController.MenuDelete(listaDeListas);
                    }
                    
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