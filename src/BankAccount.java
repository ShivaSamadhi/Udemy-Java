package src;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    //ACCOUNT NUMBER SET/GET
    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() != 9 ){
            System.out.printf("All account numbers are a 9-digit series.%nThe account number entered is invalid. Try again");
        }
        else{
            this.accountNumber = accountNumber;
        }
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    //BALANCE SET/GET
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public void depositFunds(double depositAmount){
        if (depositAmount <= 0){
            System.out.printf("This transaction cannot be completed.%nTry again.");
        }
        else {
            this.balance += depositAmount;
        }
    }

    public void withdrawFunds(double withdrawalAmount){
        if(withdrawalAmount > this.balance || withdrawalAmount < 0){
            System.out.printf("This transaction cannot be completed.%nTry again.");
        }
        else{
            this.balance -= withdrawalAmount;
        }
    }

    //CUSTOMER NAME SET/GET
    public void setCustomerName(String customerName) {
        if (customerName.isEmpty()){
            System.out.printf("Valid customer name not detected.%nTry again.");
        }
        else {
            this.customerName = customerName;
        }
    }

    public String getCustomerName(){
    return this.customerName;
    }

    //EMAIL SET/GET
    public void setEmail(String email) {
        if(email.isEmpty() || !email.contains("@")){
            System.out.printf("Invalid email.%nTry again");
        }
        else {
            this.email = email;
        }
    }
    public String getEmail(){
        return this.email;
    }

    //PHONE NUMBER SET/GET
    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 10){
            System.out.printf("Invalid phone number.%nTry again.");
        }
        else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
