public class MedicalRecord{

	/***********************Fields***************************************************/
	private int recordId;
	private String diagnosis;
	private String treatement;
	private String prescribedMedications;
	private String doctorNotes;
	private Patient patient;

	/***********************default-contructor***************************************************/
	public MedicalRecord() {
		this.recordId = 0;
		this.diagnosis = null;
		this.treatement = null;
		this.prescribedMedications = null;
		this.doctorNotes = null;
		this.patient = new Patient();
	}/*default-contructor*/

	/***********************default-contructor***************************************************/

	public MedicalRecord(int recordId, String diagnosis, String treatement, String prescribedMedications, String doctorNotes, Patient patient) {
		this.recordId = recordId;
		this.diagnosis = diagnosis;
		this.treatement = treatement;
		this.prescribedMedications = prescribedMedications;
		this.doctorNotes = doctorNotes;
		this.patient = new Patient();
	}/*6-args-contructor*/

	/***********************Setters***************************************************/
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}/*setRecordId*/

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}/*setDiagnosis*/

	public void setTreatement(String treatement) {
		this.treatement = treatement;
	}/*setTreatement*/

	public void setPrescribedMedications(String prescribedMedications) {
		this.prescribedMedications = prescribedMedications;
	}/*setPrescribedMedications*/

	public void setDoctorNotes(String doctorNotes) {
		this.doctorNotes = doctorNotes;
	}/*setDoctorNotes*/

	public void setPatient(Patient patient) {
		this.patient = patient;
	}/*setPatient*/

	/***********************Getters***************************************************/
	public int getRecordId() {
		return recordId;
	}/*getRecordId*/

	public String getDiagnosis() {
		return diagnosis;
	}/*getDiagnosis*/

	public String getTreatement() {
		return treatement;
	}/*getTreatement*/

	public String getPrescribedMedications() {
		return prescribedMedications;
	}/*getPrescribedMedications*/

	public String getDoctorNotes() {
		return doctorNotes;
	}/*getDoctorNotes*/

	public Patient getPatient() {
		return patient;
	}/*getPatient*/

	/***********************Methods***************************************************/

	public void updateRecord(String diagnosis) {
        this.diagnosis = diagnosis;
        
    }/*updateRecord*/

    public String getRecordDetails() {
        return "Record ID: " + recordId +
               "\nPatient: " + patient.getName() +
               "\nDiagnosis: " + diagnosis +
               "\nPrescribed Medications: " + prescribedMedications +
               "\nDoctor's Notes: " + doctorNotes;
    }/*getRecordDetails*/

}/*class*/