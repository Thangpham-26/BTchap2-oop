class TestAccount{
    public static void main(String[] args) {
        Account account = new Account(1, new Customer(2, "Pham Xuan Thang", 'm'),10000.0);
        System.out.println(account);
        account.withdraw(100);
        System.out.println(account);
        System.out.println(account.getCustomerName());
        account.deposit(500);
        System.out.println(account);
    }
}