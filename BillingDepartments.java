public class   BillingDepartments implements Billing {

	/***********************Fields***************************************************/

	private int billingId;
	private double totalAmount;

	/***********************default-constructor***************************************************/

	public BillingDepartments() {
		this.billingId = 0;
		this.totalAmount = 0.0;
	}/*default-constructor*/

	/***********************2-args-constructor***************************************************/
	public BillingDepartments(int billingId, double totalAmount) {
		this.billingId = billingId;
		this.totalAmount = totalAmount;
	}/*2-args-constructor*/

	/***********************Setters***************************************************/
	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}/*setBillingId*/

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}/*setTotalAmount*/

	/***********************Getters***************************************************/
	public int getBillingId() {
		return billingId;
	}/*getBillingId*/

	public double getTotalAmount() {
		return totalAmount;
	}/*getTotalAmount*/

	 

	/***********************Methods***************************************************/
    public double generateBill() {
     
        return totalAmount;
    }/*generateBill*/

    
    public void processPayments( double amount) {
     
        this.totalAmount -= amount;
    }/*processPayment*/

}/*class*/