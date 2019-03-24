package com.example.rohanupponi.scribeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.annotation.Nullable;

public class MedicalTab extends Fragment {

    private TextView primaryEmergency, primaryEmergencyPhone, secondaryEmergency, secondaryEmergencyPhone;
    private TextView bloodType, prescriptions, vaccinations, lifestyle, allergies, familyHistory, surgicalHistory, conditions;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View fragView = inflater.inflate(R.layout.fragment_medical_tab, container, false);

        primaryEmergency = fragView.findViewById(R.id.PrimaryEmergencyInput);
        primaryEmergencyPhone = fragView.findViewById(R.id.PrimaryEContactInput);
        secondaryEmergency = fragView.findViewById(R.id.SecondaryEmergencyInput);
        secondaryEmergencyPhone = fragView.findViewById(R.id.SecondaryEContactInput);
        bloodType = fragView.findViewById(R.id.BloodtypeInput);
        prescriptions = fragView.findViewById(R.id.PrescriptionInput);
        vaccinations = fragView.findViewById(R.id.VaccinationInput);
        lifestyle = fragView.findViewById(R.id.LifestyleInput);
        allergies = fragView.findViewById(R.id.AllergiesInput);
        familyHistory = fragView.findViewById(R.id.FamilyHistoryInput);
        surgicalHistory = fragView.findViewById(R.id.SurgicalHistoryInput);
        conditions = fragView.findViewById(R.id.ConditionsInput);

        primaryEmergency.setText("Emergency Contact: \t" + PatientHome.patientData.get("primary-em-contact").toString());
        primaryEmergencyPhone.setText("Emergency Phone: \t" + PatientHome.patientData.get("primary-em-phone").toString());
        secondaryEmergency.setText("Secondary Contact: \t" + PatientHome.patientData.get("secondary-em-contact").toString());
        secondaryEmergencyPhone.setText("Secondary Phone: \t" + PatientHome.patientData.get("secondary-em-phone").toString());
        bloodType.setText("Blood Type: \t" + PatientHome.patientData.get("blood-type").toString());
        prescriptions.setText("Prescriptions/Dosages: \t" + PatientHome.patientData.get("prescription-dosage").toString());
        vaccinations.setText("Vaccinations: \t" + PatientHome.patientData.get("vaccinations").toString());
        lifestyle.setText("Lifestyle: \t" + PatientHome.patientData.get("lifestyle").toString());
        allergies.setText("Allergies: \t" + PatientHome.patientData.get("allergies").toString());
        familyHistory.setText("Family Medical History: \t" + PatientHome.patientData.get("family-history").toString());
        surgicalHistory.setText("Surgical History: \t" + PatientHome.patientData.get("surgical-history").toString());
        conditions.setText("Conditions: \t" + PatientHome.patientData.get("conditions").toString());

        return fragView;
    }
}
