## This part is related to [MOOC JAVA COURSE](https://www.mooc.fi/en/)
### This part is mainly about OOP in Java

*Notes*

`public Account() {
this(0, 0.00, "John Doe", "johndoe@gmail.com", 1234567);
System.out.println("If the end user does not pass any parameters for the Account class, these default values will be" +
"added and used. It is for safety purposes");
}
`

### Creating Constructors with default values and we can pass parameters to user
`public Account(int accountNumber, double balance, String customerName) {
    this(accountNumber, balance, customerName, "dafaultemail@gmail.com", 1223445);
}`
