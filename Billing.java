public interface Billing{

/*	****************************Methods****************************************************/
	public double generateBill(Patient p); 

	public void processPayments(Patient p , double amount);

}/*class*/