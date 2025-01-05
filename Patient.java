public class Patient extends Person{

	/***********************fields***************************************************/
	private int patientId;
	private String admissionDate;
	private String dischargeDate;
	private String medicalHistory;
	private Hosiptal hosiptal;

	/***********************default-constructor***************************************************/
	public Patient() {
		this.patientId = 0;
		this.admissionDate = null;
		this.dischargeDate = null;
		this.medicalHistory = null;
		this.hosiptal = null;
	}/*default-constructor*/

	/***********************11-args-constructor***************************************************/
	public Patient(String name, int age, String type, String gender, String address, int contactNumber,int patientId, String admissionDate, String dischargeDate, String medicalHistory) {
		super(name,age,type,gender,address,contactNumber);
		this.patientId = patientId;
		this.admissionDate = admissionDate;
		this.dischargeDate = dischargeDate;
		this.medicalHistory = medicalHistory;
		this.hosiptal = hosiptal;
	}/*11-args-constructor*/

	/***********************settters***************************************************/
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}/*setPatientId*/

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}/*setAdmissionDate*/

	public void setDischargeDate(String dischargeDate) {
		this.dischargeDate = dischargeDate;
	}/*setDischargeDate*/

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}/*setMedicalHistory*/

	public void setHosiptal(Hosiptal hosiptal) {
		this.hosiptal = hosiptal;
	}/*setHosiptal*/

	/***********************getters***************************************************/
	public int getPatientId() {
		return patientId;
	}/*getPatientId*/

	public String getAdmissionDate() {
		return admissionDate;
	}/*getAdmissionDate*/

	public String getDischargeDate() {
		return dischargeDate;
	}/*getDischargeDate*/

	public String getMedicalHistory() {
		return medicalHistory;
	}/*getMedicalHistory*/

	public Hosiptal getHosiptal() {
		return hosiptal;
	}/*getHosiptal*/

	/***********************Methods***************************************************/
	public void addMedicalHistory(String medicalHistory){
		 this.medicalHistory += medicalHistory;
	}/*addMedicalHistory*/

}/*class*/