package com.shivani.restws;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import com.shivani.restws.model.Patient;

/*path: localhost:8080/restws/services/patientservice/patients */

@Path("/patientservice")
public interface PatientService {

	@Path("/patients")
	@GET
	List<Patient> getPatients();
	
	@Path("/patients/{id}")
	@GET
	Patient getPatient(@PathParam(value = "id") Long id);
	
	@Path("/patients")
	@POST
	Response createPatient(Patient patient);

	@Path("/patients")
	@PUT
	Response updatePatient(Patient patient);
	
	@Path("/patients/{id}")
	@DELETE
	Response deletePatient(@PathParam(value = "id")Long id);

}
