package jersy_webapp.jersey_webapp.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	String id;
	String content;
	
	public Message(String id, String content){
		this.id = id;
		this.content = content;
	}

}
