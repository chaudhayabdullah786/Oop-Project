import java.util.ArrayList;

public class Hosiptal{

	/***********************Fields***************************************************/

	private int hosiptalId;
	private String hosiptalName;
	private String location;
	private String departments;
	private int capacity;
	private ArrayList<Doctor> doctorArrayList;
    private ArrayList<Patient> patientArrayList;

	/***********************default-contructor***************************************************/

	public Hosiptal() {
		this.hosiptalId = 0;
		this.hosiptalName = null;
		this.location = null;
		this.departments = null;
		this.capacity = 0;
	}/*default-contructor*/

	/***********************5-args-contructor***************************************************/
	public Hosiptal(int hosiptalId, String hosiptalName, String location, String departments, int capacity) {
		this.hosiptalId = hosiptalId;
		this.hosiptalName = hosiptalName;
		this.location = location;
		this.capacity = capacity;
		 this.departments = departments;
        this.doctorArrayList = new ArrayList<>();
        this.patientArrayList = new ArrayList<>();
    

	}/*5-args-contructor*/

	/***********************setters***************************************************/
	public void setHosiptalId(int hosiptalId) {
		this.hosiptalId = hosiptalId;
	}/*setHosiptalId*/

	public void setHosiptalName(String hosiptalName) {
		this.hosiptalName = hosiptalName;
	}/*setHosiptalName*/

	public void setLocation(String location) {
		this.location = location;
	}/*setLocation*/

	public void setDepartments(String departments) {
		this.departments = departments;
	}/*setDepartments*/

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}/*setCapacity*/

	/***********************Getters***************************************************/
	public int getHosiptalId() {
		return hosiptalId;
	}/*getHosiptalId*/

	public String getHosiptalName() {
		return hosiptalName;
	}/*getHosiptalName*/

	public String getLocation() {
		return location;
	}/*getLocation*/

	public String getDepartments() {
		return departments;
	}/*getDepartments*/

	public int getCapacity() {
		return capacity;
	}/*getCapacity*/
    
    /***********************Methods***************************************************/
    public void addDoctor(Doctor d) {
        doctorArrayList.add(d);
    }/*addDoctor*/

    public void addPatient(Patient p) {
        patientArrayList.add(p);
    }/*addPatient*/

}/*class*/