//encapsulation
//encapsulation is wraping up of variables and methods 
//we can access them by only set and get 
//we make variables hidden 
//this helps in privacy pourpose 
public class Account 
{
    //we need to make variables as private 
    //then we can not access direcctly 
    //so we create set and get for each variable 
    private int accno;
    private String name;
    private double amount;
    
    void setAccno(int accno)
    {
        this.accno=accno;
        //when we are using same local and global method will confuse for that this is UnsatisfiedLinkError
        //this keyword refers to class variable 
        
    }
    int getAccno()
    {
        return accno;
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    void setAmount(double amount)
    {
        this.amount=amount;
    }
    double getAmount()
    {
        return amount;
    }
	public static void main(String[] args) {
		Account ac=new Account();
		ac.setAccno(10010);
		int c=ac.getAccno();
		System.out.println(c);
		ac.setAmount(30000);
		ac.setName("jhon");
		System.out.println(ac.getAmount());
		System.out.println(ac.getName());
	}
}
