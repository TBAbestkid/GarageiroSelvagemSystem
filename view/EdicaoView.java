package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Carro;
import model.Moto;
import model.Veiculo;
import model.VeiculoDesc;

public class EdicaoView {

    public List<List<Veiculo>> MenuEdicao(List<List<Veiculo>> listaDeListas) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
    
        while (true) {
            List<Integer> listaIndicesSublistas = new ArrayList<>();
            List<Integer> listaIndicesVeiculos = new ArrayList<>();
    
            System.out.println("""
                    Editar um Veículo
                    ==================
                    1. - Carro
                    2. - Moto
                    3. - Sair
                    """);
    
            int escolha;
    
            while (true) {
                if (sc.hasNextInt()) {
                    escolha = sc.nextInt();
                    if (escolha >= 1 && escolha <= 3) break;
                } else {
                    sc.next();
                }
                System.out.print("Opção inválida. Escolha um número de 1 a 3: ");
            }
    
            if (escolha == 3) {
                System.out.println("Saindo da edição...");
                return listaDeListas;
            }
    
            switch (escolha) {
                case 1 -> {
                    System.out.println("Exibindo todos os carros: ");
                    int count = 1;
    
                    for (int i = 0; i < listaDeListas.size(); i++) {
                        List<Veiculo> veiculoLista = listaDeListas.get(i);
    
                        for (int j = 0; j < veiculoLista.size(); j++) {
                            Veiculo veiculo = veiculoLista.get(j);
                            if (veiculo instanceof Carro && !veiculo.getVendido()) {
                                System.out.println(count + ". - " + veiculo.getModelo());
                                listaIndicesSublistas.add(i);
                                listaIndicesVeiculos.add(j);
                                count++;
                            }
                        }
                    }
    
                    if (count == 1) {  
                        System.out.println("Nenhum carro encontrado...");
                        continue;
                    }
    
                    System.out.println(count + ". - Cancelar");
    
                    int escolhaCarro;
                    while (true) {
                        System.out.print("Selecione: ");
                        if (sc.hasNextInt()) {
                            escolhaCarro = sc.nextInt();
                            if (escolhaCarro >= 1 && escolhaCarro <= count) break;
                        } else {
                            sc.next();
                        }
                        System.out.print("Opção inválida. Tente novamente: ");
                    }
    
                    if (escolhaCarro == count) {
                        System.out.println("Saindo da edição de Carros...");
                        continue;
                    }
    
                    int indiceSublista = listaIndicesSublistas.get(escolhaCarro - 1);
                    int indiceVeiculo = listaIndicesVeiculos.get(escolhaCarro - 1);
                    Veiculo veiculoSelecionado = listaDeListas.get(indiceSublista).get(indiceVeiculo);
    
                    System.out.println("""
                            Selecione a informação que deseja alterar:
                            1 - Marca
                            2 - Modelo
                            3 - Ano
                            4 - Cor 
                            5 - Quilometragem
                            6 - Valor de venda
                            7 - Valor FIPE
                            8 - Ar condicionado
                            9 - Direção hidráulica
                            10 - Placa
                            11 - Sair
                            """);

                            int editEscolha;
                            
                            while (true) {
                                if (sc.hasNextInt()) {
                                    editEscolha = sc.nextInt();
                                    sc.nextLine(); 
                                    if (editEscolha >= 1 && editEscolha <= 11) break;
                                } else {
                                    sc.next(); 
                                }
                                System.out.print("Opção inválida. Escolha um número de 1 a 11: ");
                            }

                            VeiculoDesc veiculoDesc = veiculoSelecionado.getDescOpcional();

                            switch (editEscolha) { 
                                case 1 -> {
                                    System.out.println("Digite a nova informação:");
                                    String marca = sc.nextLine();
                                    veiculoSelecionado.setMarca(marca);
                                }
                                case 2 -> {
                                    System.out.println("Digite a nova informação:");
                                    String modelo = sc.nextLine();
                                    veiculoSelecionado.setModelo(modelo);
                                }
                                case 3 -> {
                                    System.out.println("Digite a nova informação:");
                                    while (true) {
                                        if (sc.hasNextInt()) {
                                            int ano = sc.nextInt();
                                            sc.nextLine(); 
                                            veiculoSelecionado.setAno(ano);
                                            break;
                                        } else {
                                            sc.next();
                                            System.out.print("Opção inválida. Tente novamente: ");
                                        }
                                    }
                                }
                                case 4 -> {
                                    System.out.println("Digite a nova informação:");
                                    String cor = sc.nextLine();
                                    veiculoSelecionado.setCor(cor);
                                }
                                case 5 -> {
                                    System.out.println("Digite a nova informação:");
                                    while (true) {
                                        if (sc.hasNextDouble()) {
                                            double quilometragem = sc.nextDouble();
                                            sc.nextLine(); 
                                            veiculoSelecionado.setKmRodado(quilometragem);
                                            break;
                                        } else {
                                            sc.next();
                                            System.out.print("Opção inválida. Tente novamente: ");
                                        }
                                    }
                                }
                                case 6 -> {
                                    System.out.println("Digite a nova informação:");
                                    while (true) {
                                        if (sc.hasNextDouble()) {
                                            double venda = sc.nextDouble();
                                            sc.nextLine();
                                            veiculoSelecionado.setValorVendaVeiculo(venda);
                                            break;
                                        } else {
                                            sc.next();
                                            System.out.print("Opção inválida. Tente novamente: ");
                                        }
                                    }
                                }
                                case 7 -> {
                                    System.out.println("Digite a nova informação:");
                                    while (true) {
                                        if (sc.hasNextDouble()) {
                                            double vendaFipe = sc.nextDouble();
                                            sc.nextLine(); 
                                            veiculoSelecionado.setValorFipeVeiculo(vendaFipe);
                                            break;
                                        } else {
                                            sc.next();
                                            System.out.print("Opção inválida. Tente novamente: ");
                                        }
                                    }
                                }
                                case 8 -> {
                                    System.out.println("Digite a nova informação:");
                                    System.out.println("1. - Sim");
                                    System.out.println("2. - Não");
                                    int arCondicionado = 0;
                                    while (arCondicionado != 1 && arCondicionado != 2) {
                                        if (sc.hasNextInt()) {
                                            arCondicionado = sc.nextInt();
                                            sc.nextLine(); 
                                            veiculoDesc.setArCondicionado(arCondicionado == 1);
                                            break;
                                        } else {
                                            sc.next();
                                            System.out.print("Entrada inválida. Por favor, insira 1 ou 2: ");
                                        }
                                    }
                                }
                                case 9 -> {
                                    System.out.println("Digite a nova informação:");
                                    int direcaoHidraulica = 0;
                                    while (direcaoHidraulica != 1 && direcaoHidraulica != 2) {
                                        if (sc.hasNextInt()) {
                                            direcaoHidraulica = sc.nextInt();
                                            sc.nextLine(); 
                                            veiculoDesc.setDirecaoHidraulica(direcaoHidraulica == 1);
                                            break;
                                        } else {
                                            sc.next();
                                            System.out.print("Entrada inválida. Por favor, insira 1 ou 2: ");
                                        }
                                    }
                                }
                                case 10 -> {
                                    System.out.println("Digite a nova informação:");
                                    System.out.println("1. - Mercosul");
                                    System.out.println("2. - Antiga");
                                    int placa = 0;
                                    while (placa != 1 && placa != 2) {
                                        if (sc.hasNextInt()) {
                                            placa = sc.nextInt();
                                            sc.nextLine(); 
                                            boolean placaValida = false;
                                            while (!placaValida) {
                                                System.out.print("Informe a placa do veículo: ");
                                                String placaInformada = sc.nextLine();
                                                veiculoDesc.setPlaca(placaInformada);
                                                if (veiculoDesc.validarPlaca() != 0) {
                                                    placaValida = true;
                                                } else {
                                                    System.out.print("Placa inválida. Tente novamente: ");
                                                }
                                            }
                                            break;
                                        } else {
                                            sc.next();
                                            System.out.print("Entrada inválida. Por favor, insira 1 ou 2: ");
                                        }
                                    }
                                }
                                case 11 -> {
                                    System.out.println("Saindo de edição de carro...");
                                    break;
                                }
                            }
                }
    
                case 2 -> {
                    System.out.println("Exibindo todas as motos: ");
                    int count = 1;
                    for (int i = 0; i < listaDeListas.size(); i++) {
                        List<Veiculo> veiculoLista = listaDeListas.get(i);
    
                        for (int j = 0; j < veiculoLista.size(); j++) {
                            Veiculo veiculo = veiculoLista.get(j);
                            if (veiculo instanceof Moto && !veiculo.getVendido()) {
                                System.out.println(count + ". - " + veiculo.getModelo());
                                listaIndicesSublistas.add(i);
                                listaIndicesVeiculos.add(j);
                                count++;
                            }
                        }
                    }
    
                    if (count == 1) {  
                        System.out.println("Nenhuma moto encontrada...");
                        continue;
                    }
    
                    System.out.println(count + ". - Cancelar");
    
                    int escolhaMoto;
                    while (true) {
                        System.out.print("Selecione: ");
                        if (sc.hasNextInt()) {
                            escolhaMoto = sc.nextInt();
                            if (escolhaMoto >= 1 && escolhaMoto <= count) break;
                        } else {
                            sc.next();
                        }
                        System.out.print("Opção inválida. Tente novamente: ");
                    }
    
                    if (escolhaMoto == count) {
                        System.out.println("Saindo da edição de Carros...");
                        continue;
                    }
    
                    int indiceSublista = listaIndicesSublistas.get(escolhaMoto - 1);
                    int indiceVeiculo = listaIndicesVeiculos.get(escolhaMoto - 1);
                    Veiculo veiculoSelecionado = listaDeListas.get(indiceSublista).get(indiceVeiculo);
    
                    System.out.println("""
                            Selecione a informação que deseja alterar:
                            1 - Marca
                            2 - Modelo
                            3 - Ano
                            4 - Cor 
                            5 - Quilometragem
                            6 - Valor de venda
                            7 - Valor FIPE
                            8 - Placa
                            9 - Sair
                            """);
                            int editEscolha = 0;
                            while (true) {
                                if (sc.hasNextInt()) {
                                    escolha = sc.nextInt();
                                    if (escolha >= 1 && escolha <= 10) break;
                                } else {
                                    sc.next();
                                }
                                System.out.print("Opção inválida. Escolha um número de 1 a 10: ");
                            }
                            VeiculoDesc veiculoDesc = veiculoSelecionado.getDescOpcional();

                            switch (editEscolha) {
                                case 1 -> {
                                    
                                    System.out.println("Digite a nova informação:");
                                    String marca = sc.nextLine();
                                    veiculoSelecionado.setMarca(marca);
                                }
                                case 2 -> {
                                    
                                    System.out.println("Digite a nova informação:");
                                    String modelo = sc.nextLine();
                                    veiculoSelecionado.setModelo(modelo);
                                }
                                case 3 -> {
                                    
                                    System.out.println("Digite a nova informação:");
                                    while (true) {
                                        if (sc.hasNextInt()) {
                                            int ano = sc.nextInt();
                                            veiculoSelecionado.setAno(ano);
                                        } else {
                                            sc.next();
                                        }
                                        System.out.print("Opção inválida. Tente novamente: ");
                                    }
                                }
                                case 4 -> {
                                    
                                    System.out.println("Digite a nova informação:");
                                    String cor = sc.nextLine();
                                    veiculoSelecionado.setCor(cor);
                                }
                                case 5 -> {
                                    
                                    System.out.println("Digite a nova informação:");
                                    while (true) {
                                        if (sc.hasNextDouble()) {
                                            double quilometragem = sc.nextDouble();
                                            veiculoSelecionado.setKmRodado(quilometragem );
                                        } else {
                                            sc.next();
                                        }
                                        System.out.print("Opção inválida. Tente novamente: ");
                                    }
                                }
                                case 6 -> {
                                    
                                    System.out.println("Digite a nova informação:");
                                    while (true) {
                                        if (sc.hasNextDouble()) {
                                            double venda = sc.nextDouble();
                                            veiculoSelecionado.setValorVendaVeiculo(venda);
                                        } else {
                                            sc.next();
                                        }
                                        System.out.print("Opção inválida. Tente novamente: ");
                                    }
                                }
                                case 7 -> {
                                    
                                    System.out.println("Digite a nova informação:");
                                    while (true) {
                                        if (sc.hasNextDouble()) {
                                            double vendaFipe = sc.nextDouble();
                                            veiculoSelecionado.setValorFipeVeiculo(vendaFipe);
                                        } else {
                                            sc.next();
                                        }
                                        System.out.print("Opção inválida. Tente novamente: ");
                                    }
                                }
                                case 8 -> {
                                    
                                    System.out.println("Digite a nova informação:");
                                    System.out.println("1. - Mercosul");
                                    System.out.println("2. - Antiga");
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
                                }
                                case 9 -> {
                                    
                                    System.out.println("Saindo de edição de carro...");
                                    break;
                                }
                            }
                }
                default -> System.out.print("Valor invalido: ");
            }
        }
    }
    
}