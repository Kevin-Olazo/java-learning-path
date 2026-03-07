package com.ciberedu.week09_GenericsOptionals.day03_collecions_type_erasure;

import java.util.List;
import java.util.Map;

public class Hospital {
    private List<Patient> patients;
    private Map<String, MedicalRecord<?>> medicalRecords;

    public Hospital(List<Patient> patients, Map<String, MedicalRecord<?>> medicalRecords) {
        this.patients = patients;
        this.medicalRecords = medicalRecords;
    }

    public void adminPatient(Patient patient) {
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null");
        }
        patients.add(patient);
    }

    public void addMedicalRecord(String patientId, MedicalRecord<?> record) {
        if (patientId == null || record == null) {
            throw new IllegalArgumentException("Patient ID and medical record cannot be null");
        }
        medicalRecords.put(patientId, record);
    }

    public void demonstrateTypeErasure() {
        MedicalRecord<String> mr1 = new MedicalRecord<>("Prueba");
        MedicalRecord<Integer> mr2 = new MedicalRecord<>(10);

        System.out.println(mr1.getClass());
        System.out.println(mr2.getClass());
    }

    public void demonstrateRawTypeDanger(){

    }


}
