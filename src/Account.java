public class Account {

    String number;
    String name;
    float amount;

    Account(String number, String name) {
        this.number = number;
        this.name = name;
        this.amount = 0;

    }

    void printAccount() {
        System.out.println("Name: " + (this.name));
        System.out.println("Number: " + (this.number));
        System.out.println("Amount: " + (this.amount));
        System.out.println();

    }

    float income(float income) {

        this.amount += income;
        return amount;
    }

    float debit(float debit) {
        if (this.amount - debit > 0) {
            this.amount -= debit;
            return amount;
        } else {
            System.out.println("ERROR Insuficient amount");
            return amount;
        }

    }

}
