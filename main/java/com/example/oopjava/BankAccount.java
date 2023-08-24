package com.example.oopjava;

public class BankAccount {

    String titular ;
    int numeroConta;
    double saldo;

    public BankAccount(String titular, int numeroConta) {


        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void mostrarStatus(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }

    public void depositar(double valor){
        if (valor >0 ){
            this.saldo += valor;
            System.out.println("Deposito de "+valor+" Realizado na conta de "+this.titular);
        } else{
            System.out.println("Valor invalido para deposito");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado na conta de "+this.titular);
        }
    }

}
