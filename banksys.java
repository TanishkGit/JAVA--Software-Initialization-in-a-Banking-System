/*Scenario: Software Initialization in a Banking System

In a banking system, there is a requirement to initialize some crucial parameters during the software's startup. 
The development team has designed a class named "BankingSystemInitializer" to manage this initialization process.
The class contains static and non-static members to handle various aspects of the initialization.

Description:

To denote Bank ID create a variable as
nonStaticBankid, BankName as nonStaticBankName and bankbalance as nonStaticBankBalance, 
create a Static Inializer Block to print "initialization process has begun" 
and print "Banking Process has started," from anonymous block

create a parameterised constructor to intialize all the Bank Details such as 
nonStaticBankid, nonStaticBankName and nonStaticBankBalance and 
print all the details of bank from a non-static method as "printBankDetails()" which must be invoked from a main method

Sample input

nonStaticBankid as 448742310873423262
nonStaticBankName as Fedral Bank of India. 
nonStaticBankBalance as 98385354265735737

expected output

initialization process has begun
Banking Process has started,
Bank Details are:
BANK ID: 448742310873423262
BANK NAME: Fedral Bank of India.
BANK BALANCE: 98385354265735737
Thank YOU for using Fedral Bank of India.





class banksys 
{
	long nonstaticbank_id;
	String nonstaticbank_name;
	long nonstaticbank_bal;
	static //SIB
	{
		System.out.println("Initialization process has begun");
	}
	
	{     //IIB
		System.out.println("Banking Process has started,");
	}

	{
		System.out.println("Bank Details are:");
	}

	banksys(long nonstaticbank_id, String nonstaticbank_name, long nonstaticbank_bal) //CON1
	{
		this.nonstaticbank_id = nonstaticbank_id;
		this.nonstaticbank_name = nonstaticbank_name;
		this.nonstaticbank_bal = nonstaticbank_bal;

	}
	public void bankdetails()  //NONSTATIC METHOD
	{
		System.out.println("Bank id:"+nonstaticbank_id);
		System.out.println("Bank name:"+nonstaticbank_name);
		System.out.println("Bank balance :"+nonstaticbank_bal);

	}

	public static void main(String[] args) 
	{
		banksys ref1= new banksys(448742310873423262L,"Fedral Bank of India",98385354265735737L);
		ref1.bankdetails();
		System.out.println("THANK YOU for using Fedral Bank of India.");
	}
}
