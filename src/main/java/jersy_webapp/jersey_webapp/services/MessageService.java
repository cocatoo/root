package jersy_webapp.jersey_webapp.services;

import java.util.List;

import jersy_webapp.jersey_webapp.bean.Message;
import jersy_webapp.jersey_webapp.dao.MessageDao;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageService {
	
	@Autowired
	MessageDao messageDao;
	
	public List<Message> getMessages(){
		return messageDao.getMessages();
	}

}
