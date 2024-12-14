
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.id = 1;
        a1.accountNo = "020002";
        a1.balance = 500.50;
        Account a2 = new Account();
        a2.id = 2;
        a2.accountNo = "020003";
        a2.balance = 15500.0;
        a1.show();
        a2.show();
        Account a3 = new Account(3, "02200", 600.06);
        a3.show();
    }


class Account {
    int id;
    String accountNo;
    double balance;

    Account() {
        System.out.println("Default Constructor");
    }

    Account(int i, String accNo, double b) {
        id = i;
        accountNo = accNo;
        balance = b;
        System.out.println("Parameterized Constructor 1");
    }

    void show() {
        System.out.println(id);
        System.out.println(accountNo);
        System.out.println(balance);
        if (balance < 1000) {
            System.out.println("Balance is too low.");
        }
    }
}
