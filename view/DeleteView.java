package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class DeleteView {

    public List<List<Veiculo>> MenuDelete(List<List<Veiculo>> listaDeListas) {
        Scanner sc = new Scanner(System.in);
    
        while (true) {
            List<Integer> listaIndicesSublistas = new ArrayList<>();
            List<Integer> listaIndicesVeiculos = new ArrayList<>();
    
            System.out.println("""
                    Deletar um Veículo
                    ==================
                    1. - Carro
                    2. - Moto
                    3. - Ambos
                    4. - Sair
                    """);
    
            int escolha;
    
            while (true) {
                if (sc.hasNextInt()) {
                    escolha = sc.nextInt();
                    if (escolha >= 1 && escolha <= 4) break;
                } else {
                    sc.next();
                }
                System.out.print("Opção inválida. Escolha um número de 1 a 4: ");
            }
    
            if (escolha == 4) {
                System.out.println("Saindo da exclusão...");
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
                            if (veiculo instanceof Carro) {
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
                        System.out.println("Saindo da exclusão de Carros...");
                        continue;
                    }
    
                    int indiceSublista = listaIndicesSublistas.get(escolhaCarro - 1);
                    int indiceVeiculo = listaIndicesVeiculos.get(escolhaCarro - 1);
                    Veiculo veiculoSelecionado = listaDeListas.get(indiceSublista).get(indiceVeiculo);
    
                    System.out.print("Tem certeza que deseja remover " + veiculoSelecionado.getModelo() + "? (S/N): ");
                    String confirmacao = sc.next().trim().toLowerCase();
    
                    if (confirmacao.equals("s")) {
                        listaDeListas.get(indiceSublista).remove(indiceVeiculo);
                        System.out.println("Carro removido com sucesso!");
                    } else {
                        System.out.println("Exclusão de carro cancelada.");
                    }
                }
    
                case 2 -> {
                    System.out.println("Exibindo todas as motos: ");
                    int count = 1;
    
                    for (int i = 0; i < listaDeListas.size(); i++) {
                        List<Veiculo> veiculoLista = listaDeListas.get(i);
    
                        for (int j = 0; j < veiculoLista.size(); j++) {
                            Veiculo veiculo = veiculoLista.get(j);
                            if (veiculo instanceof Moto) {
                                System.out.println(count + ". - " + veiculo.getModelo());
                                listaIndicesSublistas.add(i);
                                listaIndicesVeiculos.add(j);
                                count++;
                            }
                        }
                    }
    
                    if (count == 1) { 
                        System.out.println("Nenhuma moto encontrado.");
                        continue;
                    }
    
                    System.out.println(count + ". - Cancelar");
                    System.out.print("Selecione: ");
                    int escolhaMoto;
                    while (true) {
                        if (sc.hasNextInt()) {
                            escolhaMoto = sc.nextInt();
                            if (escolhaMoto >= 1 && escolhaMoto <= count) break;
                        } else {
                            sc.next();
                        }
                        System.out.print("Opção inválida. Tente novamente: ");
                    }
    
                    if (escolhaMoto == count) {
                        System.out.println("Saindo da exclusão de Motos...");
                        continue;
                    }
    
                    int indiceSublista = listaIndicesSublistas.get(escolhaMoto - 1);
                    int indiceVeiculo = listaIndicesVeiculos.get(escolhaMoto - 1);
                    Veiculo veiculoSelecionado = listaDeListas.get(indiceSublista).get(indiceVeiculo);
    
                    System.out.print("Tem certeza que deseja remover " + veiculoSelecionado.getModelo() + "? (S/N): ");
                    String confirmacao = sc.next().trim().toLowerCase();
    
                    if (confirmacao.equals("s")) {
                        listaDeListas.get(indiceSublista).remove(indiceVeiculo);
                        System.out.println("Moto removido com sucesso!");
                    } else {
                        System.out.println("Exclusão de moto cancelada.");
                    }
                }
                case 3 -> {
                    System.out.println("Exibindo todos os veiculos: ");
                    int count = 1;

                    for (int i = 0; i < listaDeListas.size(); i++) {
                        List<Veiculo> veiculoLista = listaDeListas.get(i);
    
                        for (int j = 0; j < veiculoLista.size(); j++) {
                            Veiculo veiculo = veiculoLista.get(j);
                            if (veiculo instanceof Moto || veiculo instanceof Carro) {
                                System.out.println(count + ". - " + veiculo.getModelo());
                                listaIndicesSublistas.add(i);
                                listaIndicesVeiculos.add(j);
                                count++;
                            }
                        }
                    }
    
                    if (count == 1) { 
                        System.out.println("Nenhum veiculo encontrado.");
                        continue;
                    }
    
                    System.out.println(count + ". - Cancelar");
    
                    System.out.print("Selecione: ");
                    int escolhaVeiculo;
                    while (true) {
                        if (sc.hasNextInt()) {
                            escolhaVeiculo = sc.nextInt();
                            if (escolhaVeiculo >= 1 && escolhaVeiculo <= count) break;
                        } else {
                            sc.next();
                        }
                        System.out.print("Opção inválida. Tente novamente: ");
                    }
    
                    if (escolhaVeiculo == count) {
                        System.out.println("Saindo da exclusão de Veiculos...");
                        continue;
                    }
    
                    int indiceSublista = listaIndicesSublistas.get(escolhaVeiculo - 1);
                    int indiceVeiculo = listaIndicesVeiculos.get(escolhaVeiculo - 1);
                    Veiculo veiculoSelecionado = listaDeListas.get(indiceSublista).get(indiceVeiculo);
    
                    System.out.print("Tem certeza que deseja remover " + veiculoSelecionado.getModelo() + "? (S/N): ");
                    String confirmacao = sc.next().trim().toLowerCase();
    
                    if (confirmacao.equals("s")) {
                        listaDeListas.get(indiceSublista).remove(indiceVeiculo);
                        System.out.println("Veículo removido com sucesso!");
                    } else {
                        System.out.println("Exclusão de veiculo cancelada.");
                    }
                }
                default -> System.out.print("Valor invalido: ");
            }
        }
    }
    
}