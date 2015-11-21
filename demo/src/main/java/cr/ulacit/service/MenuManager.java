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

import cr.ulacit.dto.MenuDTO;
import cr.ulacit.model.Menu;
@WebService
@Path("/menu")
public interface MenuManager extends GenericManager<Menu,Integer> {
	@GET
	@Path("{id_menu}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<MenuDTO> findByID(@PathParam("id_menu")Integer id_menu);
	
	@POST
	@Path("/createmenu/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	boolean createmenu(@QueryParam("idMenu") Integer id_menu,@QueryParam("idEmployee") Integer id_employee);
	
	@POST
	@Path("/deletemenu/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	boolean deletemenu(@QueryParam("idMenu") Integer id_menu,@QueryParam("idEmployee") Integer id_employee);
}
