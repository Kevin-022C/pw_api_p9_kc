
package org.acme.interfaces;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.application.ServiceVehiculo;
import org.acme.domain.Vehiculo;


@Path("/vehiculoUce")
public class ResourceVehiculo {

	@Inject
	ServiceVehiculo serviceVehiculo;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@RolesAllowed("admin")
	public Response guardarVehiculo(Vehiculo vehiculo) {
		serviceVehiculo.guardarVehiculo(vehiculo);
		return Response.status(Response.Status.CREATED).build();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@RolesAllowed("admin")
	public Response obtenerVehiculoPorId(@PathParam("id") Long id) {
		Vehiculo vehiculo = serviceVehiculo.obtenerVehiculoPorId(id);
		if (vehiculo == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		return Response.ok(vehiculo).build();
	}

	@DELETE
	@Path("/{id}")
	@RolesAllowed("admin")
	public Response eliminarVehiculoPorId(@PathParam("id") Long id) {
		serviceVehiculo.eliminarVehiculoPorId(id);
		return Response.noContent().build();
	}
}
