

# Spring-Design-Patterns

Este é um projeto Spring Boot que demonstra o uso de design patterns em uma aplicação Spring.

## Descrição

Este projeto foi desenvolvido como parte de um curso da Digital Innovation One para demonstrar como aplicar design patterns em uma aplicação Spring Boot. Ele inclui exemplos de design patterns comuns, como Singleton, Factory Method, e outros, implementados em diferentes partes da aplicação.

## Requisitos

Para executar este projeto, você precisará das seguintes ferramentas e tecnologias instaladas:

- Java 17
- Maven
- Banco de dados H2 (incluso como dependência de tempo de execução)

## Estrutura do Projeto

O projeto é organizado em camadas para facilitar o desenvolvimento e a manutenção:

- **Controller**: Gerencia as solicitações HTTP relacionadas a clientes.

- **Model**: Inclui as classes `Client` e `Address`, representando informações sobre clientes e endereços.

- **Service**: Contém uma interface `ClientService` e sua implementação `ClientServiceImpl` para gerenciar operações de clientes, bem como a interface `ViaCepService` para consultar informações de CEP.

- **Repository**: Inclui as interfaces `AddressRepository` e `ClientRepository` que estendem `CrudRepository` para interagir com o banco de dados.

Esta estrutura modular ajuda na organização do projeto e na fácil adição de novos recursos.

### Repository

- **AddressRepository**: Interage com o banco de dados H2 para a entidade `Address`, realizando operações de CRUD relacionadas a endereços.

- **ClientRepository**: Interage com o banco de dados H2 para a entidade `Client`, realizando operações de CRUD relacionadas a clientes.

Essas interfaces simplificam a interação com o banco de dados e fornecem métodos eficientes para manipulação de dados.


## Executando o Projeto

Para executar o projeto, você pode usar o seguinte comando Maven:

```` 
mvn spring-boot:run 
````

A aplicação estará disponível em [http://localhost:8080](http://localhost:8080).

## Documentação da API

A documentação da API está disponível usando o Swagger. Você pode acessá-la em [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).

## Contribuindo

Sinta-se à vontade para contribuir para este projeto abrindo problemas (issues) ou enviando solicitações de pull (pull requests). Se você deseja adicionar mais exemplos de design patterns ou melhorar a documentação, sua contribuição é bem-vinda!

## Contato
- [![LinkedIn](https://img.icons8.com/fluency/48/linkedin.png)](https://www.linkedin.com/in/adriel-alexs/) [![GitHub](https://img.icons8.com/fluency/48/github.png)](https://github.com/AdrielProg) Adriel Alexander De Sousa

