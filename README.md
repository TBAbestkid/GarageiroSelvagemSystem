# GarageiroSelvagemSystem

## Descrição

O GarageiroSelvagemSystem é uma aplicação Java desenvolvida como um exercício prático do padrão de arquitetura MVC (Model-View-Controller). A aplicação oferece funcionalidades básicas de CRUD (Criar, Ler, Atualizar e Deletar) para gerenciar informações de veículos. Além disso, a aplicação apresenta uma interface de usuário baseada em menus, proporcionando uma experiência interativa e amigável.

## Funcionalidades

* **Cadastro de Veículos**: Permite o registro de novos veículos no sistema, incluindo informações como modelo, marca e ano.
* **Edição de Veículos**: Possibilita a atualização das informações de veículos já cadastrados.
* **Exclusão de Veículos**: Permite a remoção de registros de veículos do sistema.
* **Listagem de Veículos**: Exibe uma lista de todos os veículos cadastrados, organizada em listas.
* **Interface de Menu**: A aplicação é controlada por menus interativos, facilitando a navegação e o uso das funcionalidades.

## Arquitetura

A aplicação segue o padrão MVC, separando as responsabilidades em três camadas principais:

* **Model**: Representa as entidades de dados da aplicação, neste caso, a classe `Veiculo`.
* **View**: Responsável pela interface de usuário. No código apresentado, a `View` está parcialmente implementada na classe `Main`, que lida com a entrada e saída de dados no console.
* **Controller**: Atua como intermediário entre o Model e a View, processando as requisições do usuário e atualizando o Model. As classes `CadastroController` e `ListController` desempenham esse papel, gerenciando o cadastro e a listagem de veículos, respectivamente.

## Estrutura de Pastas

A estrutura de pastas do projeto segue uma organização padrão para aplicações MVC em Java:

```

GarageiroSelvagemSystem/
├── controller/
│   ├── CadastroController.java
│   └── ListController.java
├── model/
│   ├── Carro.java
│   ├── Moto.java
│   ├── Veiculo.java
│   └── VeiculoDesc.java
├── view/
│   ├── CadastroView.java
│   └── ListView.java
└── Main.java

```
## Como Executar

Para executar a aplicação, siga os passos abaixo:

1.  Certifique-se de ter o Java Development Kit (JDK) instalado em seu computador.
2.  Compile os arquivos `.java` utilizando o compilador `javac`.
3.  Execute a classe `Main` utilizando o interpretador `java`.

## Melhorias Futuras

* Implementar a funcionalidade de edição e exclusão de veículos.
* Adicionar validações de entrada para garantir a integridade dos dados.

## Conclusão

O GarageiroSelvagemSystem é um projeto educacional que demonstra os conceitos básicos do padrão MVC e do desenvolvimento de aplicações CRUD em Java. Apesar de sua simplicidade, a aplicação serve como um ponto de partida para o desenvolvimento de sistemas mais complexos e robustos.
