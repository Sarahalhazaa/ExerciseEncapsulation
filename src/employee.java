public class employee {
private String name;
private String id;
private int salary=0;

employee(){

}
employee(String name,String id,int salary){


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        if(id.length()==10){
            this.id = id;}
        System.out.println("The ID number is incorrect");
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public  int getAnnualSalary(){
    return this.salary*12;
    }
  public  int raisedSalary(int percent){
    return (this.salary*percent)/100;
  }

    @Override
    public String toString() {
        return super.toString();
    }
}
