import java.util.*;
import java.io.*;


class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankSystem {
    public static void main(String args[]) throws Exception {
        File f = new File("gani.txt");
        f.createNewFile();

     
        writeBalance(9000);

        Scanner sc = new Scanner(System.in);
        int selectOption = 0;

        while (selectOption != 4) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            selectOption = sc.nextInt();

            if (selectOption == 1) {
                System.out.println("Enter amount to deposit:");
                int amt = sc.nextInt();
                long cash = readBalance();
                long newBalance = cash + amt;
                writeBalance(newBalance);
                System.out.println("Deposit successful!");
            } else if (selectOption == 2) {
                System.out.println("Enter amount to withdraw:");
                int amt = sc.nextInt();
                long cash = readBalance();
                if (amt > cash) {
                    throw new InsufficientBalanceException("Withdraw not possible. Check your balance.");
                } else {
                    long newBalance = cash - amt;
                    writeBalance(newBalance);
                    System.out.println("Withdraw successful!");
                }
            } else if (selectOption == 3) {
                long balance = readBalance();
                System.out.println("Your balance is: " + balance);
            } else {
                System.out.println("Thank you...");
                break;
            }
        }
    }

   
    static void writeBalance(long balance) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("gani.txt", false)); // overwrite mode
        bw.write(String.valueOf(balance));
        bw.close();
    }

   
    static long readBalance() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("gani.txt"));
        String line = br.readLine();
        br.close();
        return Long.parseLong(line);
    }
}
