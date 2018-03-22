package jersy_webapp.jersey_webapp.dao;
import java.util.Arrays;
import java.util.List;

import jersy_webapp.jersey_webapp.bean.Message;


public class MessageDaoImpl implements MessageDao {

	@Override
	public List<Message> getMessages() {
		Message[] messageList = {new Message("1","Message Content1"), new Message("2","Message Content2"), new Message("3","Message Content3")}; 
		
		List<Message> list = Arrays.asList(messageList);
		return list;
	}
}
