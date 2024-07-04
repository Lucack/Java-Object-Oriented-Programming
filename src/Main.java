public class Main {

   

    public static void main(String[] args) {

        Account fisrtAccount = new Account("0108950" , "Lucas");

        fisrtAccount.printAccount();
        fisrtAccount.income(300);
        fisrtAccount.printAccount();
        fisrtAccount.debit(150);
        fisrtAccount.printAccount();
        fisrtAccount.debit(2000);
        fisrtAccount.printAccount();
    }

}
