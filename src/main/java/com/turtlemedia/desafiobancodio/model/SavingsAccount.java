package com.turtlemedia.desafiobancodio.model;

public class SavingsAccount extends Account {
    public SavingsAccount(Client client1) {
        super(client1);
    }
    @Override
    public void printStatement() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.printCommonData();
    }
}