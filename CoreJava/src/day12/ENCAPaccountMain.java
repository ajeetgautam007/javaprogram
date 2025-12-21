package day12;

public class ENCAPaccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ENCAPAccount acc=new ENCAPAccount();
	/*	acc.accno=99900000;
		acc.amount=90000;
		acc.name="Ajeet";*/
		acc.setAccno(10000);
		int a=acc.getAccno();
		System.out.println(a);
		acc.setAmount(10000.09);
		System.out.println(acc.getAmount());
		acc.setName("AJEET GAUTAM");
		System.out.println(acc.getName());
		
		
	}

}
