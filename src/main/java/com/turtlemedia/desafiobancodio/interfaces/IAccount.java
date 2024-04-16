package com.turtlemedia.desafiobancodio.interfaces;

import com.turtlemedia.desafiobancodio.model.Account;

public interface IAccount {
    void deposit(double amount);
    void withdraw(double amount);
    void transfer(Account destination, double amount);

    void printStatement();
}