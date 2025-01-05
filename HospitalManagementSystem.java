public class HospitalManagementSystem {

    public static void main(String[] args) {
        // Creating a Person (Doctor) instance
        Doctor doctor = new Doctor( "Dr. Smith", 45,"Gynacoligist", "Male", "123 Main St", 5551234, 23,"Cardiology", 20, "Monday to Friday");
        
        // Using Doctor methods
        System.out.println("Doctor's name: " + doctor.getName());
        System.out.println("Doctor's specialization: " + doctor.getSpecialization());
        doctor.setSchedule("Tuesday to Thursday");
        System.out.println("Updated schedule: " + doctor.getSchedule());

        // Creating a Patient instance
        Patient patient = new Patient( "John Doe", 30, "Cancer","Male", "456 Oak St", 5555678, 1001, "2024-08-01", "2024-08-10", "None");

        // Using Patient methods
        System.out.println("Patient's name: " + patient.getName());
        patient.setMedicalHistory("Diabetes");
        System.out.println("Updated Medical History: " + patient.getMedicalHistory());

        // Creating a MedicalRecord instance
        MedicalRecord record = new MedicalRecord(1, "Diagnosis X", "Treatment Y", "Medication Z", "Notes on patient progress", patient);

        // Using MedicalRecord methods
        System.out.println("Medical Record ID: " + record.getRecordId());
        record.updateRecord("Diagnosis Updated");
        System.out.println("Updated Diagnosis: " + record.getDiagnosis());

        


        // Output the complete details
        System.out.println("\nHospital Management System Summary:");
        System.out.println("Doctor: " + doctor.getDetails());
        System.out.println("Patient: " + patient.getDetails());
        System.out.println("Medical Record: " + record.getRecordDetails());
    }
}
