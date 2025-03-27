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
                2. - Moto
                3. - Sair """);
                
        int escolhaCadastro = 0;

        while (escolhaCadastro != 1 && escolhaCadastro != 2 && escolhaCadastro != 3) {
            if (sc.hasNextInt()) {
                escolhaCadastro = sc.nextInt();
                sc.nextLine();
    
                switch (escolhaCadastro) {
                    case 1 -> {
                        System.out.println("Cadastro de Carro");
                        Carro carro = new Carro();
    
                        System.out.println("Para iniciar o cadastro");
                        System.out.print("Informe Marca: ");
                        carro.setMarca(sc.nextLine());
    
                        System.out.print("Informe Modelo: ");
                        carro.setModelo(sc.nextLine());
    
                        System.out.print("Informe Ano: ");
                        while(true){
                            if (sc.hasNextInt()) {
                                carro.setAno(sc.nextInt());
                                sc.nextLine();
                                break;
                            } else {
                                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                                sc.next();
                            }
                        }
    
                        System.out.print("Informe Cor: ");
                        carro.setCor(sc.nextLine());
    
                        System.out.print("Informe quilometragem rodado: ");
                        while(true){
                            if (sc.hasNextDouble()) {
                                carro.setKmRodado(sc.nextDouble());
                                sc.nextLine();
                                break;
                            } else {
                                System.out.println("Entrada inválida. Por favor, insira um número.");
                                sc.next();
                            }
                        }
    
                        System.out.print("Informe valor de venda do veículo: ");
                        while(true){
                            if (sc.hasNextDouble()) {
                                carro.setValorVendaVeiculo(sc.nextDouble());
                                sc.nextLine();
                                break;
                            } else {
                                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                                sc.next();
                            }
                        }
    
                        System.out.print("Informe valor fipe de veículo: ");
                        while(true){
                            if (sc.hasNextDouble()) {
                                carro.setValorFipeVeiculo(sc.nextDouble());
                                sc.nextLine();
                                break;
                            } else {
                                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                                sc.next();
                            }
                        }

                        VeiculoDesc veiculoDesc = new VeiculoDesc();
                        System.out.println("""
                                O veículo possui ar condicionado?
                                1. - Sim
                                2. - Não
                                """);
    
                        int arCondicionado = 0; 
    
                        while (arCondicionado != 1 && arCondicionado != 2) {
                            if (sc.hasNextInt()) {
                                arCondicionado = sc.nextInt();
                                switch (arCondicionado) {
                                    case 1 -> veiculoDesc.setArCondicionado(true);
                                    case 2 -> veiculoDesc.setArCondicionado(false);
                                    default -> System.out.print("Valor inválido, insira 1 ou 2: ");
                                }
                            } else {
                                System.out.print("Entrada inválida. Por favor, insira 1 ou 2: ");
                                sc.next(); 
                            }
                        }
    
                        System.out.println("""
                                O veículo possui direção hidráulica?
                                1. - Sim
                                2. - Não
                                """);
    
                        int direcaoHidraulica = 0; 
    
                        while (direcaoHidraulica != 1 && direcaoHidraulica != 2) {
                            if (sc.hasNextInt()) {
                                direcaoHidraulica = sc.nextInt();
                                switch (direcaoHidraulica) {
                                    case 1 -> veiculoDesc.setDirecaoHidraulica(true); 
                                    case 2 -> veiculoDesc.setDirecaoHidraulica(false);
                                    default -> System.out.print("Valor inválido, insira 1 ou 2: ");
                                }
                            } else {
                                System.out.print("Entrada inválida. Por favor, insira 1 ou 2: ");
                                sc.next(); 
                            }
                        }
    
                        System.out.println("""
                                Sua placa é mercosul ou antiga?
                                1. - Mercosul
                                2. - Antiga
                                """);

                        int placa = 0;
                        
                        while (placa != 1 && placa != 2) {
                            if (sc.hasNextInt()) {
                                placa = sc.nextInt();
                                sc.nextLine();
                                switch (placa) {
                                    case 1 -> {
                                        boolean placaValida = false;
                                        while (!placaValida) {
                                            System.out.println("Formato: ABD1C23");
                                            System.out.print("Informe a placa do veículo: ");
                                            veiculoDesc.setPlaca(sc.nextLine());
                                            Integer validaPlacaMercosul = veiculoDesc.validarPlaca();
                                            if (validaPlacaMercosul == 0) {
                                                System.out.print("Placa inválida. Tente novamente: ");
                                                System.out.println(placa);
                                            } else {
                                                placaValida = true;
                                            }
                                        }
                                    }
                                    case 2 -> {
                                        boolean placaValida = false;
                                        while (!placaValida) {
                                            System.out.println("Formato: ABC-1234");
                                            System.out.print("Informe a placa do veículo: ");
                                            veiculoDesc.setPlaca(sc.nextLine());
                                            Integer validaPlacaAntiga = veiculoDesc.validarPlaca();
                                            if (validaPlacaAntiga == 0) {
                                                System.out.print("Placa inválida. Tente novamente: ");
                                                System.out.println(placa);
                                            } else {
                                                placaValida = true;
                                            }
                                        }
                                    }
                                    default -> System.out.print("Valor inválido, por favor, insira 1 ou 2: ");
                                }
                            }else {
                                System.out.print("Entrada inválida. Por favor, insira 1 ou 2: ");
                                sc.next(); 
                            }
                        }

                        carro.setDescOpcional(veiculoDesc);
                        listaVeiculos.add(carro);
                    }
    
                    case 2 -> {
                        System.out.println("Cadastro de Moto");
                        Moto moto = new Moto();
    
                        System.out.println("Para iniciar o cadastro");
                        System.out.print("Informe Marca: ");
                        moto.setMarca(sc.nextLine());
    
                        System.out.print("Informe Modelo: ");
                        moto.setModelo(sc.nextLine());
    
                        System.out.print("Informe Ano: ");
                        while(true){
                            if (sc.hasNextInt()) {
                                moto.setAno(sc.nextInt());
                                sc.nextLine();
                                break;
                            } else {
                                System.out.print("Entrada inválida. Por favor, insira um número inteiro: ");
                                sc.next();
                            }
                        }
    
                        System.out.print("Informe Cor: ");
                        moto.setCor(sc.nextLine());
    
                        System.out.print("Informe quilometragem rodado: ");
                        while(true){
                            if (sc.hasNextDouble()) {
                                moto.setKmRodado(sc.nextDouble());
                                sc.nextLine();
                                break;
                            } else {
                                System.out.print("Entrada inválida. Por favor, insira um número: ");
                                sc.next();
                            }
                        }
    
                        System.out.print("Informe valor de venda do veículo: ");
                        while(true){
                            if (sc.hasNextDouble()) {
                                moto.setValorVendaVeiculo(sc.nextDouble());
                                sc.nextLine();
                                break;
                            } else {
                                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                                sc.next();
                            }
                        }
    
                        System.out.print("Informe valor fipe de veículo: ");
                        while(true){
                            if (sc.hasNextDouble()) {
                                moto.setValorFipeVeiculo(sc.nextDouble());
                                sc.nextLine();
                                break;
                            } else {
                                System.out.print("Entrada inválida. Por favor, insira um número inteiro: ");
                                sc.next();
                            }
                        }
                        VeiculoDesc veiculoDesc = new VeiculoDesc();
    
                        System.out.println("""
                            Sua placa é mercosul ou antiga?
                            1. - Mercosul
                            2. - Antiga
                            """);

                        int placa = 0;
                            
                        while (placa != 1 && placa != 2) {
                            if (sc.hasNextInt()) {
                                placa = sc.nextInt();
                                sc.nextLine();
                                switch (placa) {
                                    case 1 -> {
                                        boolean placaValida = false;
                                        while (!placaValida) {
                                            System.out.println("Formato: ABD1C23");
                                            System.out.print("Informe a placa do veículo: ");
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
                                            System.out.println("Formato: ABC-1234");
                                            System.out.print("Informe a placa do veículo: ");
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
                            }else {
                                System.out.print("Entrada inválida. Por favor, insira 1 ou 2: ");
                                sc.next(); 
                            }
                        }
                        moto.setDescOpcional(veiculoDesc);
                        listaVeiculos.add(moto);
                    }
                    case 3 -> {
                        System.out.println("Saindo do cadastro de veiculos...");
                        break;
                    }
                    default -> System.out.print("Valor inválido. Insira 1, 2 ou 3: ");
                }
            } else {
                System.out.print("Entrada inválida, por favor insira 1, 2 ou 3: ");
                sc.next();
            }
        }
        return listaVeiculos;
    }
}