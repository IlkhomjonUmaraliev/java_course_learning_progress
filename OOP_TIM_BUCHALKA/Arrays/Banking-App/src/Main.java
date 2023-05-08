public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my banking application");
        System.out.println("Capital Bank is pleased to offer you its services");
        Bank capitalBank = new Bank();
        Customer ilkhom = new Customer("Ilkhom Umaraliev");
        System.out.println(ilkhom.getBalance());
        ilkhom.addBalance(100);
        System.out.println(ilkhom.getBalance());
        ilkhom.withdraw(100);
        System.out.println(ilkhom.getBalance());
        ilkhom.printDeposits();
        ilkhom.printWithDrawls();

        Branch tashkentBranch = new Branch("Tashkent Branch");
        System.out.println(tashkentBranch);
        tashkentBranch.addCustomer(ilkhom);
        System.out.println(tashkentBranch);

        System.out.println(capitalBank);
        capitalBank.addBranch(tashkentBranch);
        System.out.println(capitalBank);
    }
}