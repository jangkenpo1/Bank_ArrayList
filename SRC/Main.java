public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank bank2 = new Bank();

        bank.addCustomer("Cristiano", "Messi");
        bank.addCustomer("Lionel", "Ronaldo");
        bank2.addCustomer("Galang", "Aja");

        Customer customer1 = bank.getCustomer(0);
        customer1.setAccount(new Account(500000.0)); 
        customer1.setAccount(new Account(1000000.0));

        customer1.getAccount(0).deposit(200000.0);
        customer1.getAccount(0).withdraw(150000.0);

        System.out.println("Jumlah total nasabah di bank 02H: " + bank.getNumOfCustomers());
        System.out.println("Nama Nasabah 1: " + customer1.getFirstName() + " " + customer1.getLastName());
        System.out.println("Jumlah Akun Nasabah 1: " + customer1.getNumOfAccounts());
        System.out.println("Saldo Akun 1: Rp " + customer1.getAccount(0).getBalance());
        System.out.println("Menambahkan Saldo ke Akun 1 Sebesar 100.000"); customer1.getAccount(0).deposit(100000.0);
        System.out.println("Melakukan Withdrawal dari Akun 1 Sebesar 50.000"); customer1.getAccount(0).withdraw(50000.0);
        System.out.println("Saldo Akun 1: Rp " + customer1.getAccount(0).getBalance());
        System.out.println("Saldo Akun 2: Rp " + customer1.getAccount(1).getBalance());
        System.out.println("Jumlah total nasabah di bank B2F: " + bank2.getNumOfCustomers());
    }
}