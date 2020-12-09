package com.clearminds.cbe.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.clearminds.cbe.dtos.Estudiante;
import com.clearminds.cbe.excepciones.BDDException;





@Path("/estudiantes")
public class RestEstudiantes {

	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante) {
		ServicioEstudiante srve = new ServicioEstudiante();
		try {
			srve.insertarEstudiante(estudiante);
			System.out.println("Estudiante: "+estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
		
	}
	
	@Path("/mostrar")
	@GET
	public String mostrar() {
		return "Mensaje de prueba";
	}
	
	@Path("/actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante estudiante) {
		ServicioEstudiante srve = new ServicioEstudiante();
		try {
			srve.actualizarEstudiante(estudiante);
			System.out.println("Estudiante: "+estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
		
	}
}
