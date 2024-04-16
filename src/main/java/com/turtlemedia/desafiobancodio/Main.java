/**
 * Desafio Banco Digital: Projeto de exemplo de um banco digital desenvolvido em Java. *
 * @author Diego Di Paula
 */
package com.turtlemedia.desafiobancodio;

import com.turtlemedia.desafiobancodio.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);



        // Criando um banco digital
        DigitalBank bank = new DigitalBank();
        bank.setName("Banco DiODigital");

        // Criando clientes
        Client client1 = new Client("Diego Di Paula", "12345678901");
        Client client2 = new Client("Bruna Carvalho", "98765432109");

        // Criando contas para os clientes
        CheckingAccount checkingAccount = new CheckingAccount(client1);
        SavingsAccount savingsAccount = new SavingsAccount(client1);

	    CheckingAccount checkingAccount2 = new CheckingAccount(client2);
        SavingsAccount savingsAccount2 = new SavingsAccount(client2);

        System.out.println("\nTransações iniciais:");
        checkingAccount.deposit(100);
        checkingAccount.transfer(savingsAccount, 100);

        checkingAccount.deposit(120);
        checkingAccount.transfer(savingsAccount2, 110);

        savingsAccount2.withdraw(10);


        System.out.println("\nSaldo após transações:");

        checkingAccount.printStatement();
        savingsAccount.printStatement();

        checkingAccount2.printStatement();
        savingsAccount2.printStatement();

        // Listagem das contas do banco
        System.out.println("\nListagem de Contas do Banco:");
        List<Account> accounts = new ArrayList<>();
        accounts.add(checkingAccount);
        accounts.add(savingsAccount);
        accounts.add(checkingAccount2);
        accounts.add(savingsAccount2);

        for (Account account : accounts) {
            System.out.println("Cliente: " + account.getClient().getName());
            System.out.println("CPF: " + account.getClient().getCpf());
            System.out.println("Número da Agência: " + account.getAgencyNumber());
            System.out.println("Número da Conta: " + account.getAccountNumber());
            // Imprimir o tipo de conta corretamente
            if (account instanceof CheckingAccount) {
                System.out.println("Tipo de Conta: Conta Corrente");
            } else if (account instanceof SavingsAccount) {
                System.out.println("Tipo de Conta: Conta Poupança");
            }
            System.out.println("Saldo: R$ " + String.format("%.2f", account.getBalance()));
            System.out.println("--------------------");
        }
    }
}

