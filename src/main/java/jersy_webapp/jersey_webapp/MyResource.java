package jersy_webapp.jersey_webapp;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jersy_webapp.jersey_webapp.bean.Message;
import jersy_webapp.jersey_webapp.services.MessageService;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	
	@Autowired
	MessageService messageService;
	
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessages(){
		
		 return "Hi be smart";
	}	*/
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(){
		List<Message> ml =  messageService.getMessages();
		System.out.println(ml); 
		 return ml;
	}	
}
