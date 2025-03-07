package view;

import java.util.Scanner;
import model.Moto;
import model.Carro;
import model.VeiculoDesc;


public class CadastroView {
    public void MenuCadastro()
    {
        Scanner sc = new Scanner(System.in);
        {
            {
                System.out.println("""
                                                           Cadastrar veículo
                                                           =================
                                                           1. - Carro
                                                           2. - Moto """);
                int escolhaCadastro = sc.nextInt();
                
                switch (escolhaCadastro) {
                    case 1:
                    System.out.println("Carro");
                    Carro carro = new Carro();
                    
                    System.out.println("Para iniciar o cadastro");
                    System.out.println("Informe Marca: ");
                    carro.setMarca(sc.nextLine());
                    
                    sc.nextLine();
                    System.out.println("Informe Modelo: ");
                    carro.setModelo(sc.nextLine());
                    
                    System.out.print("Informe Ano: ");
                    carro.setAno(sc.nextInt());
                    
                    sc.nextLine();
                    System.out.print("Informe Cor: ");
                    carro.setCor(sc.nextLine());
                    
                    System.out.println("Informe quilometragem rodado: ");
                    carro.setKmRodado(sc.nextDouble());
                    
                    System.out.print("Informe valor de venda do veículo: ");
                    carro.setValorVendaVeiculo(sc.nextDouble());
                    
                    System.out.print("Informe valor fipe de veículo: ");
                    carro.setValorFipeVeiculo(sc.nextDouble());
                    
                    VeiculoDesc veiculoDesc = new VeiculoDesc();
                    System.out.println("""
                                                O veículo possui ar condicionado?
                                                1. - Sim
                                                2. - Não
                                                """);
                    int arCondicionado = sc.nextInt();
                    switch (arCondicionado) {
                        case 1 -> {
                            veiculoDesc.setArCondicionado(true);
                            break;
                        }
                        case 2 -> {
                            veiculoDesc.setArCondicionado(false);
                            break;
                        }
                        default -> System.out.println("Valor inválido");
                    }
                    System.out.println("""
                                                O veículo possui direção hidráulica?
                                                1. - Sim
                                                2. - Não
                                                """);
                    int direcaoHidraulica = sc.nextInt();
                    switch(direcaoHidraulica) {
                        case 1 -> {
                            veiculoDesc.setDirecaoHidraulica(true);
                            break;
                        }
                        case 2 -> {
                            veiculoDesc.setDirecaoHidraulica(false);
                            break;
                        }
                        default -> System.out.println("Valor inválido");
                    }
                    break;
                    
                    case 2:
                    System.out.println("Moto");
                    Moto moto = new Moto();
                    break;
                    
                    default:
                    sc.close();
                    throw new AssertionError();
                }
            }
        }
        sc.close();
    }
}