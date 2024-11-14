package com.atm.model;

import java.util.Scanner;

public class Account {
    public static final double MINIMUM_BALANCE = 50000;
    private String accountNumber;
    private String pin;
    private double balance;

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        this.balance -= amount;
    }

    
    public void changePin() {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan PIN Lama: ");
        String oldPin = scanner.nextLine();
        
        if (!oldPin.equals(this.pin)) {
            System.out.println("PIN lama tidak sesuai.");
            return;
        }

        System.out.print("Masukkan PIN Baru: ");
        String newPin1 = scanner.nextLine();
        System.out.print("Masukkan PIN Baru Lagi untuk Konfirmasi: ");
        String newPin2 = scanner.nextLine();

        if (newPin1.equals(newPin2)) {
            this.pin = newPin1;
            System.out.println("PIN berhasil diubah.");
        } else {
            System.out.println("PIN baru tidak cocok. Silakan coba lagi.");
        }
    }
}
