public class Account {

 private String name;
private String id;
private int balance=0;


    Account(){

    }
Account(String name,String id){
        this.name=name;
        this.id=id;

}
Account(String name,String id , int balance){
    this.name=name;
    this.id=id;
    this.balance=balance;


    }

    public void setName(String name) {
        this.name = name;
    }


    public void setId(String id) {
        if(id.length()==10){
        this.id = id;}
        System.out.println("The ID number is incorrect");
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    public int getBalance() {
        return balance;
    }
    public int credit(int amount ){
return this.balance= amount+this.balance;
    }
    public int debit(int amount  ){
        if (amount <= this.balance) {
return this.balance=this.balance-amount;}
        return this.balance;
    }
    public int transferTo(Account a,int amount ) {
        if (amount <= this.balance) {
            debit(amount);
            return a.credit(amount);
        } else System.out.println("Balance not available");
        return a.balance;
    }


//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
