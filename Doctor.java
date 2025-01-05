public class Doctor extends Person{

	/***********************fields***************************************************/
	private int doctorId;
	private String specialization;
	private int yearsOfExperience;
	private String schedule;
	private Hosiptal hosiptal;

	/***********************default-constructor***************************************************/
	public Doctor() {
		this.doctorId = 0;
		this.specialization = null;
		this.yearsOfExperience = 0;
		this.schedule = null;
		this.hosiptal = null;
	}/*default-constructor*/

	public Doctor(String name, int age, String type, String gender, String address, int contactNumber,int doctorId, String specialization, int yearsOfExperience, String schedule) {
		super(name,age,type,gender,address,contactNumber);
		this.doctorId = doctorId;
		this.specialization = specialization;
		this.yearsOfExperience = yearsOfExperience;
		this.schedule = schedule;
		this.hosiptal =  hosiptal;
	}/*11-constructor*/

	/***********************setters***************************************************/

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}/*setDoctorId*/

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}/*setSpecialization*/

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}/*setYearsOfExperience*/

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}/*setSchedule*/

	public void setHosiptal(Hosiptal hosiptal) {
		this.hosiptal = hosiptal;
	}/*setHosiptal*/

	/***********************getters***************************************************/

	public int getDoctorId() {
		return doctorId;
	}/*getDoctorId*/

	public String getSpecialization() {
		return specialization;
	}/*getSpecialization*/

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}/*getYearsOfExperience*/

	public String getSchedule() {
		return schedule;
	}/*getSchedule*/

	public Hosiptal getHosiptal() {
		return hosiptal;
	}/*getHosiptal*/

	/***********************Methods***************************************************/
	public void diagnosisPatient(Patient p){

        System.out.println("Diagnosing patient: " + p.getName());
	}/*diagnosisPatient*/

}/*class*/