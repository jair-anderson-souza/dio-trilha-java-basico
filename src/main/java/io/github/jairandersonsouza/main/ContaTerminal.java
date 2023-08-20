package io.github.jairandersonsouza.main;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Conta conta = new Conta();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta !");
        conta.setNumero(scanner.nextInt());

        System.out.println("Por favor, digite a Agência !");
        conta.setAgencia(scanner.next());

        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");
        conta.setNomeDoCliente(scanner.nextLine());

        System.out.println("Por favor, digite o saldo !");
        conta.setSaldo(scanner.nextBigDecimal());

        System.out.println("Olá " + conta.getNomeDoCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta  " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque");

        scanner.close();
    }
}
