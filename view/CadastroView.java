package view;

import java.util.Scanner;
import model.Carro;
import model.VeiculoDesc;

public class CadastroView {
    public void MenuCadastro() {
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
                }

                case 2 -> System.out.println("Moto");

                default -> System.out.println("Opção inválida");
            }
        } else {
            System.out.println("Entrada inválida, por favor insira um número.");
            sc.next();
        }
    }
}