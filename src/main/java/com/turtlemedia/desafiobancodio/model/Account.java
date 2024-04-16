package com.turtlemedia.desafiobancodio.model;

import com.turtlemedia.desafiobancodio.interfaces.IAccount;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Account implements IAccount {
    private static final int STANDARD_AGENCY = 1;
    private static int SEQUENCE = 1;

    protected String agencyNumber;
    protected String accountNumber;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agencyNumber = String.valueOf(Account.STANDARD_AGENCY);
        this.accountNumber = String.valueOf(SEQUENCE++);
        this.client = client;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depósito de R$ " + String.format("%.2f", amount) + " para conta " + accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Saque de R$ " + String.format("%.2f", amount) + " da conta " + accountNumber);
        } else {
            System.out.println("Saldo insuficiente para saque da conta " + accountNumber);
        }
    }

    @Override
    public void transfer(Account destination, double amount) {
        if (balance >= amount) {
            balance -= amount;
            destination.deposit(amount);
            System.out.println("Transferindo R$ " + String.format("%.2f", amount) + " da conta " + accountNumber +
                    " para conta " + destination.getAccountNumber());
        } else {
            System.out.println("Saldo insuficiente para transferência da conta " + accountNumber);
        }
    }

    protected void printCommonData() {
        System.out.println(String.format("Titular: %s", this.client.getName()));
        System.out.println(String.format("CPF: %s", this.client.getCpf()));
        System.out.println(String.format("Agência: %s", this.agencyNumber));
        System.out.println(String.format("Número: %s", this.accountNumber));
        System.out.println(String.format("Saldo: %.2f", this.balance));
        System.out.println("---------------------");
    }

}