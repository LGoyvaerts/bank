package test.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gol on 08.02.2017.
 */
public class BankAccount {
    List<BankAccount> accounts = new ArrayList<>();

    void createAccount() {
        accounts.add(BankAccount);
    }

    private long kontonummer;
    private double kontostand;

    public void deposit(double betrag) {
        kontostand += betrag;
    }

    public void withdraw(double betrag) {
        if (betrag > kontostand) {
            System.out.println(false);
            System.exit(0);
        }
        kontostand -= betrag;
    }
}
