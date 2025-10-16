# Sistema de Gerenciamento de Contas Bancárias em Java

Este projeto é um sistema desenvolvido em Java para gerenciamento de **contas bancárias**, incluindo funcionalidades de **saque e depósito**, com validações de limite e **exceções personalizadas**.  
Ele permite cadastrar contas, realizar operações financeiras e exibir os resultados no terminal.

---

## 📋 Funcionalidades

- Cadastro de contas bancárias com número da conta, nome do titular, saldo inicial e limite de saque.  
- Realização de depósitos e saques com validação de saldo e limite.  
- Tratamento de erros por meio de exceções personalizadas (`LimiteSaqueException`).  
- Exibição formatada do saldo após operações.

---

## 🔹 Classes Principais

| Classe / Pacote | Descrição |
|-----------------|-----------|
| `Conta` | Representa uma conta bancária com atributos `numeroConta`, `nomeTitular`, `saldo` e `limiteSaque`. Possui métodos `deposito()` e `saque()` com validação de limite. |
| `LimiteSaqueException` | Exceção personalizada para tratar erros de saque, como saldo insuficiente ou valor excedendo o limite permitido. |
| `ProgramaPrincipal` | Classe principal que interage com o usuário, realiza depósitos e saques, e exibe os resultados no terminal. |

---

## ⚙️ Tecnologias e Conceitos Aplicados

- Java SE 17+  
- Programação Orientada a Objetos (POO)  
- Encapsulamento e validação em métodos  
- Criação e uso de exceções personalizadas  
- Manipulação de entradas pelo terminal (`Scanner`)  
- Cálculo e atualização de saldo de contas  
- Tratamento de erros com `try/catch`

---

## 👨‍💻 Autor

João Neto  

neto31510@gmail.com  

(34) 99683-2626  

[LinkedIn](https://www.linkedin.com/in/joao-rodrigues-neto-855757293)
