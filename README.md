# Desafio Banco Digital com Java Orientado a Objetos

Este é um projeto de exemplo de um banco digital desenvolvido em Java e foi desenvolvido seguindo os quatro pilares da orientação a objetos:

1. **Encapsulamento**: As classes foram projetadas com atributos privados e métodos públicos para garantir o encapsulamento dos dados e comportamentos. Por exemplo, a classe `Account` encapsula informações como saldo, número da conta e cliente, e fornece métodos para operações como depósito, saque e transferência.

2. **Abstração**: O projeto utiliza abstração para representar entidades do mundo real de forma simplificada. Por exemplo, a interface `IAccount` define métodos abstratos para operações com contas, como depósito, saque e transferência, que são implementados nas classes `CheckingAccount` e `SavingsAccount`.

3. **Herança**: A hierarquia de classes foi utilizada para estabelecer relações de herança entre tipos de contas. A classe abstrata `Account` é a classe base para `CheckingAccount` e `SavingsAccount`, que herdam comportamentos e características comuns de uma conta, como saldo e operações financeiras.

4. **Polimorfismo**: O projeto demonstra o polimorfismo ao permitir que métodos como `deposit`, `withdraw`, `transfer` e `printStatement` se comportem de maneira diferente nas classes `CheckingAccount` e `SavingsAccount`, mesmo sendo chamados através de uma referência do tipo `Account`.

Esses conceitos da orientação a objetos são fundamentais para a organização e estruturação do código, proporcionando reutilização, flexibilidade e manutenibilidade.

## Visão Geral

O projeto consiste em classes Java que representam um banco digital, clientes, contas correntes e contas poupança. Sendo assim, este banco conta com as funcionalidades de depósito, saque e transferência (entre contas da própria instituição). 

## Tecnologias Utilizadas

- Java
- Spring Boot (para a aplicação principal)
- Lombok (para geração de getters e setters)

## Funcionalidades

- Criação de clientes
- Criação de contas correntes e contas poupança
- Depósitos, saques e transferências entre contas
- Impressão de extratos de contas
- Listagem de contas