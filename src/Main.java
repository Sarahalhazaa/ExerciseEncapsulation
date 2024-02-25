public class Main {
    public static void main(String[] args)
    {
//--------------------------------------(Account)-------------------------------------------------------------
        Account A1 = new Account();
        A1.setName("sara");
       A1.setId("1234567890");
       A1.setBalance(100000);
        System.out.printf("%n Account 1 :%nName: "+A1.getName()+"%nID: "+A1.getId()+"%nBalance: "+A1.getBalance()+"%ncredit: "+ A1.credit(1000)+"%ndebit: "+ A1.debit(2000)+"%n");
        Account A2 = new Account();
        A2.setName("yara");
        A2.setId("1237899876");
        A2.setBalance(800);
        System.out.printf("%n Account 2 :%nName: "+A2.getName()+"%nID: "+A2.getId()+"%nBalance: "+A2.getBalance()+"%ntransferTo A2: "+A1.transferTo(A2,1000)+"%n");




//-------------------------------------(employee)---------------------------------------------------
       employee e=new employee() ;
       e.setName("sara");
       e.setId("2345678");
       e.setSalary(9000);
System.out.printf("%nName: "+e.getName()+"%nID: "+e.getId()+"%nSalary: "+e.getSalary()+"%nAnnual Salary: "+e.getAnnualSalary()+"%nRaised Salary: "+ e.raisedSalary(10)+"%n");




    }
}