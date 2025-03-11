package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Carro;
import model.Moto;
import model.Veiculo;
import model.VeiculoDesc;

public class CadastroView {
    @SuppressWarnings("resource")
    public List<Veiculo> MenuCadastro() {
        List<Veiculo> listaVeiculos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                            Cadastrar veículo
                            =================
                            1. - Carro
                            2. - Moto """);
        if (sc.hasNextInt()) {
            int escolhaCadastro = sc.nextInt();
            sc.nextLine();

            switch (escolhaCadastro) {
                case 1 -> {
                    System.out.println("Carro");
                    Carro carro = new Carro();

                    System.out.println("Para iniciar o cadastro");
                    System.out.println("Informe Marca: ");
                    carro.setMarca(sc.nextLine());

                    System.out.println("Informe Modelo: ");
                    carro.setModelo(sc.nextLine());

                    System.out.print("Informe Ano: ");
                    if (sc.hasNextInt()) {
                        carro.setAno(sc.nextInt());
                        sc.nextLine();
                    }

                    System.out.print("Informe Cor: ");
                    carro.setCor(sc.nextLine());

                    System.out.println("Informe quilometragem rodado: ");
                    if (sc.hasNextDouble()) {
                        carro.setKmRodado(sc.nextDouble());
                    }

                    System.out.print("Informe valor de venda do veículo: ");
                    if (sc.hasNextDouble()) {
                        carro.setValorVendaVeiculo(sc.nextDouble());
                    }

                    System.out.print("Informe valor fipe de veículo: ");
                    if (sc.hasNextDouble()) {
                        carro.setValorFipeVeiculo(sc.nextDouble());
                    }

                    VeiculoDesc veiculoDesc = new VeiculoDesc();
                    System.out.println("""
                                                           O veículo possui ar condicionado?
                                                           1. - Sim
                                                           2. - Não
                                                           """);
                    if (sc.hasNextInt()) {
                        int arCondicionado = sc.nextInt();
                        switch (arCondicionado) {
                            case 1 -> veiculoDesc.setArCondicionado(true);
                            case 2 -> veiculoDesc.setArCondicionado(false);
                            default -> System.out.println("Valor inválido");
                        }
                    }

                    System.out.println("""
                                                           O veículo possui direção hidráulica?
                                                           1. - Sim
                                                           2. - Não
                                                           """);
                    if (sc.hasNextInt()) {
                        int direcaoHidraulica = sc.nextInt();
                        switch (direcaoHidraulica) {
                            case 1 -> veiculoDesc.setDirecaoHidraulica(true);
                            case 2 -> veiculoDesc.setDirecaoHidraulica(false);
                            default -> System.out.println("Valor inválido");
                        }
                    }

                    System.out.println("""
                                                              Sua placa é mercosul ou antiga?
                                                              1. - Mercosul
                                                              2. - Antiga
                                                              """);
                    if (sc.hasNextInt()) {
                    int placa = sc.nextInt();
                    sc.nextLine();
                    switch (placa) {
                        case 1 -> {
                            boolean placaValida = false;
                            while (!placaValida) {
                                System.out.println("Informe a placa do veículo: ");
                                veiculoDesc.setPlaca(sc.nextLine());
                                Integer validaPlacaMercosul = veiculoDesc.validarPlaca();
                                if (validaPlacaMercosul == 0) {
                                    System.out.println("Placa inválida. Tente novamente.");
                                    System.out.println(placa);
                                } else {
                                    placaValida = true; 
                                }
                            }
                        }
                        case 2 -> {
                            boolean placaValida = false;
                            while (!placaValida) {
                                System.out.println("Informe a placa do veículo: ");
                                veiculoDesc.setPlaca(sc.nextLine());
                                Integer validaPlacaAntiga = veiculoDesc.validarPlaca();
                                if (validaPlacaAntiga == 0) {
                                    System.out.println("Placa inválida. Tente novamente.");
                                    System.out.println(placa);
                                } else {
                                    placaValida = true; 
                                }
                            }
                        }
                        default -> System.out.println("Valor inválido");
                    }
                }
                    carro.setDescOpcional(veiculoDesc);
                    listaVeiculos.add(carro); 
                }

                case 2 -> {
                    System.out.println("Moto");
                    Moto moto = new Moto(); 

                    System.out.println("Para iniciar o cadastro");
                    System.out.println("Informe Marca: ");
                    moto.setMarca(sc.nextLine());
                    System.out.println("Informe Modelo: ");
                    moto.setModelo(sc.nextLine());
                    System.out.print("Informe Ano: ");
                    if (sc.hasNextInt()) {
                        moto.setAno(sc.nextInt());
                        sc.nextLine();
                    }
                    System.out.print("Informe Cor: ");
                    moto.setCor(sc.nextLine());
                    System.out.println("Informe quilometragem rodado: ");
                    if (sc.hasNextDouble()) {
                        moto.setKmRodado(sc.nextDouble());
                    }
                    System.out.print("Informe valor de venda do veículo: ");
                    if (sc.hasNextDouble()) {
                        moto.setValorVendaVeiculo(sc.nextDouble());
                    }
                    System.out.print("Informe valor fipe de veículo: ");
                    if (sc.hasNextDouble()) {
                        moto.setValorFipeVeiculo(sc.nextDouble());
                    }
                    VeiculoDesc veiculoDesc = new VeiculoDesc();
                    // Placa
                    System.out.println("Sua placa é mercosul ou antiga?");
                    if (sc.hasNextInt()) {
                        int placa = sc.nextInt();
                        sc.nextLine();
                        switch (placa) {
                            case 1 -> veiculoDesc.setPlaca("Mercosul"); 
                            case 2 -> veiculoDesc.setPlaca("Antiga");
                            default -> System.out.println("Valor inválido");
                        }
                    }

                    moto.setDescOpcional(veiculoDesc);
                    listaVeiculos.add(moto);
                }

                default -> System.out.println("Opção inválida");
            }
        } else {
            System.out.println("Entrada inválida, por favor insira um número.");
            sc.next();
        }
        System.out.println("\nVeículos cadastrados: ");
        for (Veiculo veiculo : listaVeiculos) {
            System.out.println(veiculo);
    }
     return listaVeiculos;
}
}