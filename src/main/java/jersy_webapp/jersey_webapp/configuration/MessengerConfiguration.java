package jersy_webapp.jersey_webapp.configuration;

import jersy_webapp.jersey_webapp.MyResource;
import jersy_webapp.jersey_webapp.dao.MessageDao;
import jersy_webapp.jersey_webapp.dao.MessageDaoImpl;
import jersy_webapp.jersey_webapp.services.MessageService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class MessengerConfiguration {
	
	@Bean
    public MessageService messageService() {
		System.out.println("in MessageService");
        return new MessageService(); 
    }	
	
	@Bean
    public MessageDao messageDao() {
		System.out.println("in MessageDao");
        return new MessageDaoImpl(); 
    }
	
	@Bean
	public MyResource myResource(){
		return new MyResource();
	}
}
