package com.bl.ObjectOrientedPrograms;


/*
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ClinicMethods {

	private static Scanner sc = new Scanner(System.in);
	private String doctorFilePath="doctorsFile.json";
	private String patientFilePath="PatientFile.json";
	private String AppointmentPath="Appointment.json";
	private  JSONObject docFileObj;
	private  JSONArray docFileArr;
	private  JSONObject patientFileObj;
	private  JSONArray patientFileArr;
	private  JSONObject appointFileObj;
	private  JSONArray appointFileArr;

	public  ClinicMethods()
	{
		docFileObj =new JSONObject();
		docFileArr =new JSONArray();
		patientFileObj= new JSONObject();
		patientFileArr=new JSONArray();
		appointFileObj=new JSONObject();
		appointFileArr=new JSONArray();
	}

	public void addDoctor() throws IOException, ParseException {
		File file = new File(doctorFilePath);

		if(file.length()==0) {
			addDoc();
		}else {
			addJsonDoc();
		}
	}
	public void addDoc() throws IOException{
		Scanner sc = new Scanner(System.in);		
		DoctorInformation doc = new DoctorInformation();
		System.out.println("Enter doctor name :");
		String docName = sc.nextLine();
		doc.setDocName(docName);
		System.out.println("Enter doctor id :");
		String docId = sc.nextLine();
		doc.setDocId(docId);
		System.out.println("Enter doctor specialization");
		String docSpec = sc.nextLine();
		doc.setSpecialization(docSpec);
		System.out.println("Enter doctor availability");
		String aval = sc.nextLine();
		doc.setAvailability(aval);
		createjsonDoc(doc);
	}
	@SuppressWarnings("unchecked")
	public void createjsonDoc(DoctorInformation doc) throws IOException {
		JSONObject simple = new JSONObject();

		simple.put("DoctorName", doc.getDocName());
		simple.put("DocId", doc.getDocId());
		simple.put("Specialization",doc.getSpecialization());
		simple.put("Availability",doc.getAvailability());
		docFileArr.add(simple);
		docFileObj.put("DoctorList",docFileArr);
		writeIntoFile(doctorFilePath,docFileObj);
	}
	public void addJsonDoc() throws FileNotFoundException, IOException, ParseException {									///////////////////////new method
		Scanner sc = new Scanner(System.in);		
		DoctorInformation doc = new DoctorInformation();
		System.out.println("Enter doctor name :");
		String docName = sc.nextLine();
		doc.setDocName(docName);
		System.out.println("Enter doctor id :");
		String docId = sc.nextLine();
		doc.setDocId(docId);
		System.out.println("Enter doctor specialization");
		String docSpec = sc.nextLine();
		doc.setSpecialization(docSpec);
		System.out.println("Enter doctor availability");
		String aval = sc.nextLine();
		doc.setAvailability(aval);
		addToDocjsonObj(doc);
	}
	@SuppressWarnings("unchecked")
	public void addToDocjsonObj(DoctorInformation doc) throws FileNotFoundException, IOException, ParseException {
		File file = new File(doctorFilePath);
		JSONObject simple = new JSONObject();
		JSONObject outer = new JSONObject();
		simple.put("DoctorName", doc.getDocName());
		simple.put("DocId", doc.getDocId());
		simple.put("Specialization",doc.getSpecialization());
		simple.put("Availability",doc.getAvailability());
		JSONParser parse = new JSONParser();
		Object  obj =parse.parse(new FileReader(file));
		JSONObject jsonObj = (JSONObject) obj;
		JSONArray jsonArr = (JSONArray) jsonObj.get("DoctorList");
		jsonArr.add(simple);
		outer.put("DoctorList", jsonArr);
		writeIntoFile(doctorFilePath,outer);
	}
	public void writeIntoFile(String filePath,JSONObject object) throws IOException {
		File file = new File(filePath);
		FileWriter fw = new FileWriter(file);
		fw.write(object.toString());
		fw.flush();
	}
	public void addPatient() throws IOException, ParseException {
		File file = new File(patientFilePath);
		if(file.length()==0) {
			patientAdd();
		}else {
			addJsonPat();
		}
	}
	public void patientAdd() throws IOException {
		Scanner sc =new Scanner(System.in);
		PatientInformation patient = new PatientInformation();
		System.out.println("Enter patient name :");
		String pName = sc.nextLine();
		patient.setPatientName(pName);
		System.out.println("Enter patient id :");
		String pId =sc.nextLine();
		patient.setPatientId(pId);
		System.out.println("Enter patient mobile number :");
		String pMob=sc.nextLine();
		patient.setPatientMobile(pMob);
		createjsonPat(patient);
	}
	@SuppressWarnings("unchecked")
	public void createjsonPat(PatientInformation patient) throws IOException {
		JSONObject simple = new JSONObject();
		simple.put("PatientName",patient.getPatientName());
		simple.put("PatientId", patient.getPatientId());
		simple.put("PatientMob",patient.getPatientMobile());
		patientFileArr.add(simple);
		patientFileObj.put("PatientDetails",patientFileArr);
		writeIntoFile(patientFilePath,patientFileObj);
	}

	public void addJsonPat() throws FileNotFoundException, IOException, ParseException {
		Scanner sc =new Scanner(System.in);
		PatientInformation patient = new PatientInformation();
		System.out.println("Enter patient name :");
		String pName = sc.nextLine();
		patient.setPatientName(pName);
		System.out.println("Enter patient id :");
		String pId =sc.nextLine();
		patient.setPatientId(pId);
		System.out.println("Enter patient mobile number :");
		String pMob=sc.nextLine();
		patient.setPatientMobile(pMob);
		addToPatjsonObj(patient);
	}

	@SuppressWarnings("unchecked")
	public void addToPatjsonObj( PatientInformation patient) throws FileNotFoundException, IOException, ParseException {
		File file = new File(patientFilePath);
		JSONObject simple = new JSONObject();
		simple.put("PatientName",patient.getPatientName());
		simple.put("PatientId", patient.getPatientId());
		simple.put("PatientMob",patient.getPatientMobile());
		JSONObject outer = new JSONObject();
		JSONParser parse = new JSONParser();
		Object  obj =parse.parse(new FileReader(file));
		JSONObject jsonObj = (JSONObject) obj;
		JSONArray jsonArr = (JSONArray) jsonObj.get("PatientDetails");
		jsonArr.add(simple);
		outer.put("PatientDetails", jsonArr);
		writeIntoFile(patientFilePath,outer);
	}
	
}
*/
