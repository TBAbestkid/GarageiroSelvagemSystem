package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Carro;
import model.Moto;
import model.Veiculo;
import model.VeiculoDesc;


public class ListView {

    public void MenuList(List<List<Veiculo>> listaDeListas) { 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Buscar por veículo
                =================
                1. - Carro
                2. - Moto
                3. - Ambos
                4. - Sair """);
       int escolhaCadastro = 0;
        while (escolhaCadastro != 1 && escolhaCadastro != 2 && escolhaCadastro != 3 && escolhaCadastro != 4) {
            if (sc.hasNextInt()) {
                
                escolhaCadastro = sc.nextInt();
                sc.nextLine();

                switch (escolhaCadastro) {
                    case 1 -> {
                        System.out.println("""
                                Carros
                                =================
                                1. - Listar todos
                                2. - Filtrar por marca
                                3. - Filtrar por ano
                                4. - Sair
                                """);

                        int escolhaCarro = 0;
                        
                        while (escolhaCarro != 1 && escolhaCarro != 2 && escolhaCarro != 3 && escolhaCarro != 4) {
                            if (sc.hasNextInt()) {
                                escolhaCarro = sc.nextInt();
                                sc.nextLine();
                    
                                switch (escolhaCarro) {
                                    case 1 -> {
                                        System.out.println("Listando todos os carros:");
                                        for (List<Veiculo> veiculoLista : listaDeListas) {
                                            for (Veiculo veiculo : veiculoLista) {
                                                if (veiculo instanceof Carro) {
                                                    System.out.println(veiculo);
                                                }
                                            }
                                        }
                                    }

                                    case 2 -> {
                                        // Set<String> marcasDisponiveis = new HashSet<>();
    
                                        // for (List<Veiculo> veiculoLista : listaDeListas) {
                                        //     for (Veiculo veiculo : veiculoLista) {
                                        //         if (veiculo instanceof Carro) {
                                        //             Carro carro = (Carro) veiculo;
                                        //             marcasDisponiveis.add(carro.getMarca());
                                        //         }
                                        //     }
                                        // }
                                        // System.out.println("Marcas disponíveis:");
                                        // for (String marca : marcasDisponiveis) {
                                        //     System.out.println("- " + marca);
                                        // }
                                    
                                        System.out.print("Digite a marca do carro: ");
                                        String marcaCarro = sc.nextLine();
                    
                                        System.out.println("Listando carros da marca " + marcaCarro + ":");
                                        for (List<Veiculo> veiculoLista : listaDeListas) {
                                            for (Veiculo veiculo : veiculoLista) {
                                                if (veiculo instanceof Carro) {
                                                    Carro carro = (Carro) veiculo;
                                                    if (carro.getMarca().equalsIgnoreCase(marcaCarro)) {
                                                        System.out.println(carro);
                                                    }
                                                } 
                                            }
                                        }
                                    }
                                    case 3 -> {
                                        System.out.print("Digite o ano do carro: ");
                                        int anoCarro = sc.nextInt();
                                        sc.nextLine();
                    
                                        System.out.println("Listando carros do ano " + anoCarro + ":");
                                        for (List<Veiculo> veiculoLista : listaDeListas) {
                                            for (Veiculo veiculo : veiculoLista) {
                                                if (veiculo instanceof Carro) {
                                                    Carro carro = (Carro) veiculo;
                                                    if (carro.getAno() == anoCarro) {
                                                        System.out.println(carro);
                                                    }
                                                } 
                                            }
                                        }
                                    }
                                    case 4 -> {
                                        System.out.println("Saindo da listagem de carros...");
                                        escolhaCarro = 4;
                                    }
                                    default -> System.out.print("Opção inválida, por favor insira um número válido: ");
                                }
                            } else {
                                System.out.print("Entrada inválida, por favor insira um número: ");
                                sc.next();
                            }
                        }
                    }

                    case 2 -> {
                        
                        System.out.println("""
                                Motos
                                =================
                                1. - Listar todos
                                2. - Filtrar por marca
                                3. - Filtrar por ano
                                4. - Sair
                                """);
                        
                        int escolhaMoto = 0;

                        while (escolhaMoto != 1 && escolhaMoto != 2 && escolhaMoto != 3 && escolhaMoto != 4){
                            if (sc.hasNextInt()) {
                                escolhaMoto = sc.nextInt();
                                sc.nextLine();

                                switch (escolhaMoto) {
                                    case 1 -> {
                                        System.out.println("Listando todas as motos:");
                                        for (List<Veiculo> veiculoLista : listaDeListas) {
                                            for (Veiculo veiculo : veiculoLista) {
                                                if (veiculo instanceof Moto) {
                                                    System.out.println(veiculo);
                                                }
                                            }
                                        }
                                    }

                                    case 2 -> {
                                        // // Coletando as marcas únicas das motos
                                        // Set<String> marcasDisponiveis = new HashSet<>();
                                        
                                        // for (List<Veiculo> veiculoLista : listaDeListas) {
                                        //     for (Veiculo veiculo : veiculoLista) {
                                        //         if (veiculo instanceof Moto) {  // Verifica se é uma moto
                                        //             Moto moto = (Moto) veiculo;  // Faz o cast para Moto
                                        //             marcasDisponiveis.add(moto.getMarca());  // Adiciona a marca da moto ao conjunto
                                        //         }
                                        //     }
                                        // }
                                        
                                        // // Exibindo as marcas disponíveis para o usuário
                                        // System.out.println("Marcas disponíveis:");
                                        // for (String marca : marcasDisponiveis) {
                                        //     System.out.println("- " + marca);
                                        // }
                                    
                                        System.out.print("Digite a marca da moto: ");
                                        String marcaMoto = sc.nextLine();

                                        System.out.println("Listando motos da marca " + marcaMoto + ":");
                                        for (List<Veiculo> veiculoLista : listaDeListas) {
                                            for (Veiculo veiculo : veiculoLista) {
                                                if (veiculo instanceof Moto) {
                                                    Moto moto = (Moto) veiculo;
                                                    if (carro.getMarca().equalsIgnoreCase(marcaMoto)) {
                                                        System.out.println(moto);
                                                    }
                                                } 
                                            }
                                        }
                                    }

                                    case 3 -> {
                                        System.out.print("Digite o ano da moto: ");
                                        int anoMoto = sc.nextInt();
                                        sc.nextLine();

                                        System.out.println("Listando motos do ano " + anoMoto + ":");
                                        for (List<Veiculo> veiculoLista : listaDeListas) {
                                            for (Veiculo veiculo : veiculoLista) {
                                                if (veiculo instanceof Moto) {
                                                    Moto moto = (Moto) veiculo;
                                                    if (moto.getAno() == anoMoto) {
                                                        System.out.println(moto);
                                                    }
                                                } 
                                            }
                                        }
                                    }

                                    case 4 ->{
                                        System.out.println("Saindo da listagem de motos...");
                                        escolhaMoto = 4;
                                    }

                                    default -> System.out.print("Opção inválida, por favor insira um número válido: ");
                                }
                            } else {
                                System.out.print("Entrada inválida, por favor insira um número: ");
                                sc.next();
                            }
                        }
                        
                    }

                    case 3 ->{
                        System.out.println("""
                            Veiculos Geral
                            =================
                            1. - Listar todos
                            2. - Filtrar por marca
                            3. - Filtrar por ano
                            4. - Sair
                            """);

                        int escolhaAmbos = 0;
                        while (escolhaAmbos != 1 && escolhaAmbos != 2 && escolhaAmbos != 3 && escolhaAmbos != 4) {
                            if (sc.hasNextInt()) {
                                escolhaAmbos = sc.nextInt();
                                sc.nextLine();
                                
                                switch(escolhaAmbos){
                                    case 1 ->{
                                        System.out.println("Listando todos os veículos:");
                                        for (List<Veiculo> veiculoLista : listaDeListas) {
                                            for (Veiculo veiculo : veiculoLista) {
                                                System.out.println(veiculo);
                                            }
                                        }
                                    }
                                    case 2 ->{
                                        System.out.print("Digite a marca do veículo: ");
                                        String marcaVeiculo = sc.nextLine();

                                        System.out.println("Listando veículos da marca " + marcaVeiculo + ":");
                                        for (List<Veiculo> veiculoLista : listaDeListas) {
                                            for (Veiculo veiculo : veiculoLista) {
                                                if (veiculo.getMarca().equals(marcaVeiculo)) {
                                                    System.out.println(veiculo);
                                                } else {
                                                    System.out.println("Nenhum veículo encontrado com a marca " + marcaVeiculo);
                                                }
                                            }
                                        }
                                    }
                                    case 3 ->{
                                        System.out.print("Digite o ano do veículo: ");
                                        int anoVeiculo = sc.nextInt();
                                        sc.nextLine();

                                        System.out.println("Listando veículos do ano " + anoVeiculo + ":");
                                        for (List<Veiculo> veiculoLista : listaDeListas) {
                                            for (Veiculo veiculo : veiculoLista) {
                                                if (veiculo.getAno() == anoVeiculo) {
                                                    System.out.println(veiculo);
                                                } else {
                                                    System.out.println("Nenhum veículo encontrado com o ano " + anoVeiculo);
                                                }
                                            }
                                        }
                                    }
                                    case 4 ->{
                                        System.out.println("Saindo da listagem de veículos...");
                                        escolhaAmbos = 4;
                                    }
                                    default ->{
                                        System.out.print("Opção inválida, por favor insira um número válido: ");
                                    }
                                }
                            } else {
                                System.out.print("Entrada inválida, por favor insira um número: ");
                                sc.next();
                            }
                        }
                    }

                    case 4 -> {
                        System.out.println("Saindo da listagem...");
                        escolhaCadastro = 4;
                    }
                    default -> System.out.print("Opção inválida, por favor insira um número válido: ");
                }

            } else {
                System.out.println("Entrada inválida, por favor insira um número.");
                sc.next();
            }
        }
    }
}
