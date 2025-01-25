# API de Gerenciamento de Jogos 🎮

Este projeto é uma API RESTful desenvolvida em **Java** utilizando **Spring Boot**, **JPA** e a arquitetura **MVC**. O objetivo é gerenciar listas de jogos, permitindo operações como listar todos os jogos, buscar detalhes de um jogo específico e reordenar listas de jogos.

## 📋 Índice
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Arquitetura](#-arquitetura)
- [Endpoints da API](#-endpoints-da-api)
- [Como Executar](#-como-executar)
- [Contribuindo](#-contribuindo)
- [Licença](#-licença)

---

## 🛠 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Maven** como gerenciador de dependências
- **Banco de Dados H2** (banco em memória para testes)

---

## 🏠 Arquitetura
O projeto segue a arquitetura **MVC** (Model-View-Controller) e está organizado nos seguintes pacotes principais:

### Pacotes:
- **Controllers**: Contém os endpoints da API.
    - Exemplo: `GameController` e `GameListController`
- **DTOs (Data Transfer Objects)**: Responsáveis por transportar dados entre camadas.
    - Exemplo: `GameDTO`, `GameMinDTO`, `GameListDTO`, `ReplacementDTO`
- **Entities**: Representa os modelos das tabelas do banco de dados.
    - Exemplo: `Game`, `GameList`, `Belonging`
- **Projections**: Interfaces para consultas customizadas com JPA.
- **Repositories**: A camada responsável por interagir com o banco de dados.
- **Services**: Implementa as regras de negócio da aplicação.

---

## 🚀 Como Executar
1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Yuri-Diego/springtraining.git
   cd sua-repositorio
   ```

2. **Compile o projeto com Maven:**
   ```bash
   mvn clean install
   ```

3. **Execute o projeto:**
   ```bash
   mvn spring-boot:run
   ```

4. **Acesse a API atraves do Postman:**
   - A aplicação estará disponível em `http://localhost:8080`.

---

## 📜 Licença
Este projeto está sob a licença **MIT**. Consulte o arquivo `LICENSE` para mais detalhes.

