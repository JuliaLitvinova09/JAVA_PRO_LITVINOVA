package homework8;

import homework8.entity.Client;
import homework8.exception.WrongFieldException;
import homework8.exception.WrongSumException;
import homework8.service.TransactionService;
import homework8.util.Helper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Client sender = new Client("Alex_Stone", "Stone", "Alex Stone", 0);
        TransactionService transactionService = new TransactionService();

        System.out.println("Input account of sender:");
        String senderID = inputValue();

        System.out.println("Input account of recipient:");
        String recipientID = inputValue();

        System.out.println("Input amount of transfer:");
        double sumOfTransfer = inputSum();

        transactionService.transferOfMoney(sender, senderID);
        System.out.println("Transfer completed successfully!");
    }

    public static String inputValue() {
        Helper helper = new Helper();
        String inputID = null;

        while (true) {
            try {
                inputID = scanner.nextLine();
                helper.checkID(inputID);
                return inputID;
            } catch (WrongFieldException e) {
                System.out.println("Incorrect value of account! Try again!");
            }
        }
    }

    public static double inputSum() {
        Helper helper = new Helper();
        double sumOfTransfer = 0;

        while (true) {
            try {
                sumOfTransfer = scanner.nextDouble();
                helper.checkAmount(sumOfTransfer);
                return sumOfTransfer;
            } catch (WrongSumException e) {
                System.out.println("Invalid amount allowable range! Try again!");
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value of amount of transfer! Try again!");
                scanner.next();
            }
        }
    }
}