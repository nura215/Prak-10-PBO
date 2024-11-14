package com.atm.transaction;

import java.util.Scanner;

import com.atm.model.Account;

public class Withdrawal extends Transaction {

    public Withdrawal(Account account) {
        super(account);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah penarikan: ");
        double amount = scanner.nextDouble();


        if (amount <= account.getBalance() - Account.MINIMUM_BALANCE) {
            account.debit(amount);
            System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + account.getBalance());
        } else {
            System.out.println("Saldo tidak mencukupi, " +"saldo minimal Rp" + Account.MINIMUM_BALANCE);
        }
    }
}
