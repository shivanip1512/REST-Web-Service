package com.shivani.restws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.shivani.restws.model.Patient;

@Path("/patientservice")
public interface PatientService {

	@Path("/patients")
	@GET
	List<Patient> getPatients();
	
	@Path("/patients/{id}")
	@GET
	Patient getPatient(@PathParam(value = "id") Long id);
}
