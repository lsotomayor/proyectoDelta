package cr.ulacit.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import cr.ulacit.dto.EmployeeDTO;
import cr.ulacit.model.Employee;
@WebService
@Path("/employee")
public interface EmployeeManager extends GenericManager<Employee, Integer> {
	@GET
	@Path("/IDemployee")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })	
	List<EmployeeDTO> findByIdEmployee(@PathParam("id_employee") Integer id);
	
	@GET
	@Path("/Name")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })	
	List<EmployeeDTO> findByName(@QueryParam("name") String name);
	
	@POST
	@Path("/createemployee/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	boolean createemployee(@QueryParam("idEmployee") Integer id,@QueryParam("name") String name,@QueryParam("password") String password);
	
	@POST
	@Path("/deleteemployee/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	boolean deleteemployee(@QueryParam("idEmployee") Integer id);
}
