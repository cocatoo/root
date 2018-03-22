package jersy_webapp.jersey_webapp.dao;

import java.util.List;

import jersy_webapp.jersey_webapp.bean.Message;



public interface MessageDao {

	public List<Message> getMessages();
}
