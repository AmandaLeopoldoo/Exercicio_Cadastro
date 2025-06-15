# Projeto Alturas

Este projeto é um exercício simples em Java para manipulação de arrays, encapsulamento e entrada de dados pelo console. O objetivo é registrar informações de várias pessoas (nome, idade e altura), calcular a altura média do grupo, determinar o percentual de pessoas menores de 16 anos e listar os nomes dessas pessoas.

## Funcionalidades

- Cadastro de múltiplas pessoas, incluindo nome, idade e altura.
- Cálculo da altura média de todas as pessoas cadastradas.
- Cálculo do percentual de pessoas com menos de 16 anos.
- Listagem dos nomes das pessoas com menos de 16 anos.

## Estrutura do Projeto

- **Pessoa:** Classe que representa uma pessoa, com atributos privados de nome, idade e altura, além de métodos de acesso (getters).
- **Register:** Classe responsável por armazenar um vetor de pessoas e fornecer métodos para:
  - Calcular altura média.
  - Calcular percentual de menores de 16 anos.
  - Listar nomes dos menores de 16 anos.
- **alturas:** Classe principal (com método `main`). Faz a interação com o usuário pelo console, coleta os dados e exibe os resultados.

## Como executar

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/seu-repo.git
   cd seu-repo
   ```
2. Compile os arquivos Java:
   ```sh
   javac entities/Pessoa.java entities/Register.java exercicios/alturas.java
   ```
3. Execute o programa:
   ```sh
   java exercicios.alturas
   ```
4. Siga as instruções no console para inserir os dados das pessoas.

## Exemplo de uso

```
Quantas pessoas serão digitadas? 3
Dados da 1a pessoa:
Nome: João
Idade: 15
Altura: 1.70
Dados da 2a pessoa:
Nome: Maria
Idade: 18
Altura: 1.65
Dados da 3a pessoa:
Nome: Pedro
Idade: 14
Altura: 1.72

Altura média: 1.69
Pessoas com menos de 16 anos: 66.7%
João
Pedro
```

## Requisitos

- Java 8 ou superior

## Organização dos arquivos

```
entities/
  Pessoa.java
  Register.java
exercicios/
  alturas.java
```

## Licença

Este projeto é apenas para fins educacionais.
